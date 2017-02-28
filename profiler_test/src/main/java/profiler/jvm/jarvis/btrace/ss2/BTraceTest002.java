package profiler.jvm.jarvis.btrace.ss2;

import java.util.Random;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * -Xshare:off
 * -javaagent:D:\bin\btrace-bin-1.3.8.3\build\btrace-agent.jar=script=D:\dev\dawdler\profiler_test\target\classes\profiler\jvm\jarvis\btrace\ss2\BTraceTestScript001.class,debug=true,unsafe=true,dumpClasses=true
 */
public class BTraceTest002 {

    private static Logger logger = LogManager.getLogger(BTraceTest002.class.getName());

    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // 计数器
        Counter counter = new Counter();
        while (true) {
            // 每次增加随机值
            int tmp = counter.add(random.nextInt(10));
            logger.info("tmp ==== " + tmp);
            Thread.sleep(1000);
        }
    }
}
