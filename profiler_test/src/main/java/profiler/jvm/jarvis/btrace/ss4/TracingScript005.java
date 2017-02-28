package profiler.jvm.jarvis.btrace.ss4;

import static com.sun.btrace.BTraceUtils.classOf;
import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.str;
import static com.sun.btrace.BTraceUtils.strcat;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnEvent;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;
import com.sun.btrace.annotations.TargetInstance;
import com.sun.btrace.annotations.TargetMethodOrField;

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
        println("====== ");
        println(strcat("ProbeClassName: ", pcm));
        println(strcat("ProbeMethodName: ", pmn));
        println(strcat("TargetInstance: ", str(classOf(instance))));
        println(strcat("TargetMethodOrField : ", str(method)));
        count++;
    }

    @OnEvent
    public static void getCount() {
        println(strcat("count: ", str(count)));
    }

    @OnEvent("A")
    public static void getCountA() {
        println("==AAAA==== ");
        println(strcat("count: ", str(count)));
    }

    @OnEvent("B")
    public static void getCountB() {
        println("==BBB==== ");
        println(strcat("count: ", str(count)));
    }
}
