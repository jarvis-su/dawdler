package profiler.jvm.jarvis.btrace.ss3;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * -Xshare:off -javaagent:/Users/Jarvis/external_bin/btrace-bin-1.3.8.3/build/btrace-agent.jar=script=/Users/Jarvis/Documents/workspace/dawdler/profiler_test/target/classes/profiler/jvm/jarvis/btrace/ss3/MemoryScript001.class,debug=true,unsafe=true,dumpClasses=true
 */
public class Test_3001 {

    private static Logger logger = LogManager.getLogger(Test_3001.class.getName());

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int i = random.nextInt(100);
            list.add("String " + Integer.toString(i));
            logger.log(Level.DEBUG, "new item is " + Integer.toString(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
