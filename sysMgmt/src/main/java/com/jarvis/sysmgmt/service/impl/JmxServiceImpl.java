package com.jarvis.sysmgmt.service.impl;

import com.jarvis.sysmgmt.service.JmxService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.management.*;
import javax.management.remote.JMXConnector;
import javax.management.remote.JMXConnectorFactory;
import javax.management.remote.JMXServiceURL;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class JmxServiceImpl implements JmxService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    @Override
    public void getAllActiveTasks() {
        echo("\nCreate an RMI connector client and " +
                "connect it to the RMI connector server");
        String serviceURL = "service:jmx:rmi:///jndi/rmi://:9999/jmxrmi";
        serviceURL = "service:jmx:rmi:///jndi/rmi://10.237.89.205:7779/jmxrmi";
        JMXServiceURL url = null;
        JMXConnector jmxc = null;
        try {
            url = new JMXServiceURL(serviceURL);
            jmxc = JMXConnectorFactory.connect(url, null);
            ClientListener listener = new ClientListener();
            echo("\nGet an MBeanServerConnection");
            MBeanServerConnection mbsc = jmxc.getMBeanServerConnection();
            echo("\nDomains:");
            String domains[] = mbsc.getDomains();
            Arrays.sort(domains);
            for (String domain : domains) {
                echo("\tDomain = " + domain);
            }

            echo("\nMBeanServer default domain = " + mbsc.getDefaultDomain());
            echo("\nMBean count = " + mbsc.getMBeanCount());
            echo("\nQuery MBeanServer MBeans:");
            Set<ObjectName> names = new TreeSet<>(mbsc.queryNames(null, null));
            for (ObjectName name : names) {
                echo("\tObjectName = " + name);
            }
            echo("\n>>> Perform operations on EPPIC MBean <<<");
            ObjectName mbeanName = new ObjectName("sms:name=Scheduler");
            //MBeanInfo mi = mbsc.getMBeanInfo(mbeanName);

            mbsc.invoke(mbeanName, "runTaskNow", new Object[]{"aaa", "com.tps.sysmgmt.scheduler.tasks.providermaintenance.LAProviderMaintenanceTask", " "},
                    new String[]{String.class.getName(), String.class.getName(), String.class.getName()});


            @SuppressWarnings("unchecked")
			List<String> attris = (List<String>) mbsc.getAttribute(mbeanName, "ActiveScheduledTasks");
            for (String attri : attris) {
                echo("ActiveScheduledTask: " + attri);
            }
            echo("\nClose the connection to the server");
    		jmxc.close();
    		echo("\nBye! Bye!");
    		
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException | ReflectionException | InstanceNotFoundException | AttributeNotFoundException | MBeanException | MalformedObjectNameException e) {
            e.printStackTrace();
        }

    }


    private void echo(String msg) {
        logger.info(msg);
    }

    public class ClientListener implements NotificationListener {
        @Override
        public void handleNotification(Notification notification,
                                       Object handback) {
            echo("\nReceived notification:");
            echo("\tClassName: " + notification.getClass().getName());
            echo("\tSource: " + notification.getSource());
            echo("\tType: " + notification.getType());
            echo("\tMessage: " + notification.getMessage());
            if (notification instanceof AttributeChangeNotification) {
                AttributeChangeNotification acn = (AttributeChangeNotification) notification;
                echo("\tAttributeName: " + acn.getAttributeName());
                echo("\tAttributeType: " + acn.getAttributeType());
                echo("\tNewValue: " + acn.getNewValue());
                echo("\tOldValue: " + acn.getOldValue());
            }
        }
    }
}
