package profiler.jvm.jarvis.btrace.ss4;


import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.str;
import static com.sun.btrace.BTraceUtils.strcat;
import static com.sun.btrace.BTraceUtils.timeNanos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Duration;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.TLS;

@BTrace(unsafe=true)
public class TracingScript003 {

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

    @TLS
    private static long startTime = 0;

    @OnMethod(
            clazz = "profiler.jvm.jarvis.btrace.ss4.CaseObject",
            method = "execute"
    )
    public static void startExecute() {
        startTime = timeNanos();
    }

    @OnMethod(
            clazz = "profiler.jvm.jarvis.btrace.ss4.CaseObject",
            method = "execute",
            location = @Location(Kind.RETURN)
    )
    public static void endExecute(@Duration long duration) {
        long time = timeNanos() - startTime;
        println(strcat("execute time(nanos): ", str(time)));
        println(strcat("duration(nanos): ", str(duration)));
    }
}
