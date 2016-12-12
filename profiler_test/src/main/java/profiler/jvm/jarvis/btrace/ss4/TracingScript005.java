package profiler.jvm.jarvis.btrace.ss4;

import com.sun.btrace.annotations.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import static com.sun.btrace.BTraceUtils.*;

@BTrace(unsafe=true)
public class TracingScript005 {

    private static final Object mutex = new Object();
    private static BufferedWriter bw = null;
    private static boolean inited = false;
    private static void init() {
        try {
            bw = new BufferedWriter(new PrintWriter(new File("D:/log/t.log")));
            bw.write("test ");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        inited = true;
    }

    public static void dealLog(String log) {
        synchronized (mutex) {
            try {
                if (!inited) {
                    init();
                }
                bw.write(log + "\n");
                bw.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static long count;

    @OnMethod(
            clazz = "/.*/",
            method = "execute",
            location = @Location(value = Kind.CALL, clazz = "/.*/", method = "sleep")
    )
    public static void traceExecute(@ProbeClassName String pcm, @ProbeMethodName String pmn,
                                    @TargetInstance Object instance, @TargetMethodOrField String method) {
        dealLog("====== ");
        dealLog(strcat("ProbeClassName: ", pcm));
        dealLog(strcat("ProbeMethodName: ", pmn));
        dealLog(strcat("TargetInstance: ", str(classOf(instance))));
        dealLog(strcat("TargetMethodOrField : ", str(method)));
        count++;
    }

    @OnEvent
    public static void getCount() {
        dealLog(strcat("count: ", str(count)));
    }

    @OnEvent("A")
    public static void getCountA() {
        dealLog("==AAAA==== ");
        dealLog(strcat("count: ", str(count)));
    }

    @OnEvent("B")
    public static void getCountB() {
        println("==BBB==== ");
        println(strcat("count: ", str(count)));
    }
}
