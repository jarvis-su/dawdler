package profiler.jvm.zzm.chapter4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * -Xshare:off
 * -javaagent:D:\repo\com\sun\tools\btrace\btrace-agent\1.2.3\btrace-agent-1.2.3.jar=script=D:\dev\dawdler\profiler_test\target\classes\profiler\jvm\zzm\chapter4\TracingScript001.class,debug=true,unsafe=true,dumpClasses=true
 */
public class BTraceTest {

    public static void main(String[] args) throws IOException {
        BTraceTest test = new BTraceTest();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 10; i++) {
            reader.readLine();
            int a = (int) Math.round(Math.random() * 1000);
            int b = (int) Math.round(Math.random() * 1000);
            System.out.println(test.add(a, b));
        }
    }

    public int add(int a, int b) {
        return a + b;
    }
}

