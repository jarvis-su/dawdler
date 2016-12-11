package profiler.jvm.jarvis.btrace.ss4;


import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class TracingScript003 {
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
