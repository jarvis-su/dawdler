package com.jarvis.sysmgmt.service.impl;

import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.management.AttributeChangeNotification;
import javax.management.AttributeNotFoundException;
import javax.management.InstanceNotFoundException;
import javax.management.MBeanException;
import javax.management.MBeanServerConnection;
import javax.management.MalformedObjectNameException;
import javax.management.Notification;
import javax.management.NotificationListener;
import javax.management.ObjectName;
import javax.management.ReflectionException;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.jarvis.sysmgmt.service.JmxService;

@Service
public class JmxServiceImpl implements JmxService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @PostConstruct
    public void init() {
        logger.info("jsr250-init-method");
    }

    public JmxServiceImpl() {
        super();
        logger.info(" init the service  ");
    }

    @PreDestroy
    public void destroy() {
        logger.info("jsr250-destory-method");
    }

    @Override
    public void getAllActiveTasks() {
        logger.info("\nCreate an RMI connector client and " +
                "connect it to the RMI connector server");
        String serviceURL = "service:jmx:rmi:///jndi/rmi://:9999/jmxrmi";
        serviceURL = "service:jmx:rmi:///jndi/rmi://10.237.89.205:7779/jmxrmi";
        JMXServiceURL url = null;
        JMXConnector jmxc = null;
        try {
            url = new JMXServiceURL(serviceURL);
            jmxc = JMXConnectorFactory.connect(url, null);
//            ClientListener listener = new ClientListener();
            logger.info("\nGet an MBeanServerConnection");
            MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
            logger.info("\nDomains:");
            String domains[] = mbsc.getDomains();
            Arrays.sort(domains);
            for (String domain : domains) {
                logger.info("\tDomain = " + domain);
            }

            logger.info("\nMBeanServer default domain = " + mbsc.getDefaultDomain());
            logger.info("\nMBean count = " + mbsc.getMBeanCount());
            logger.info("\nQuery MBeanServer MBeans:");
            Set<ObjectName> names = new TreeSet<>(mbsc.queryNames(null, null));
            for (ObjectName name : names) {
                logger.info("\tObjectName = " + name);
            }
            logger.info("\n>>> Perform operations on EPPIC MBean <<<");
            ObjectName mbeanName = new ObjectName("sms:name=Scheduler");
            //MBeanInfo mi = mbsc.getMBeanInfo(mbeanName);

            mbsc.invoke(mbeanName, "runTaskNow", new Object[]{"aaa", "com.tps.sysmgmt.scheduler.tasks.providermaintenance.LAProviderMaintenanceTask", " "},
                    new String[]{String.class.getName(), String.class.getName(), String.class.getName()});


            @SuppressWarnings("unchecked")
            List<String> attris = (List<String>) mbsc.getAttribute(mbeanName, "ActiveScheduledTasks");
            for (String attri : attris) {
                logger.info("ActiveScheduledTask: " + attri);
            }
            logger.info("\nClose the connection to the server");
            jmxc.close();
            logger.info("\nBye! Bye!");

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException | ReflectionException | InstanceNotFoundException | AttributeNotFoundException | MBeanException | MalformedObjectNameException e) {
            e.printStackTrace();
        }

    }

    public class ClientListener implements NotificationListener {
        @Override
        public void handleNotification(Notification notification,
                                       Object handback) {
            logger.info("\nReceived notification:");
            logger.info("\tClassName: " + notification.getClass().getName());
            logger.info("\tSource: " + notification.getSource());
            logger.info("\tType: " + notification.getType());
            logger.info("\tMessage: " + notification.getMessage());
            if (notification instanceof AttributeChangeNotification) {
                AttributeChangeNotification acn = (AttributeChangeNotification) notification;
                logger.info("\tAttributeName: " + acn.getAttributeName());
                logger.info("\tAttributeType: " + acn.getAttributeType());
                logger.info("\tNewValue: " + acn.getNewValue());
                logger.info("\tOldValue: " + acn.getOldValue());
            }
        }
    }
}
