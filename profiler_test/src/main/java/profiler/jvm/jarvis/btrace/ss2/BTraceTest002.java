package profiler.jvm.jarvis.btrace.ss2;

import java.util.Random;

/**
 * -Xshare:off
 * -javaagent:D:\bin\btrace-bin-1.3.8.3\build\btrace-agent.jar=script=D:\dev\dawdler\profiler_test\target\classes\profiler\jvm\jarvis\btrace\ss2\BTraceTestScript001.class,debug=true,unsafe=true,dumpClasses=true
 */
public class BTraceTest002 {
    public static void main(String[] args) throws Exception {
        Random random = new Random();

        // 计数器
        Counter counter = new Counter();
        while (true) {
            // 每次增加随机值
            counter.add(random.nextInt(10));
            Thread.sleep(1000);
        }
    }
}
