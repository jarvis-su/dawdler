package profiler.jvm.jarvis.btrace.ss3;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnTimer;

import static com.sun.btrace.BTraceUtils.println;

/**
 * Created by C5023792 on 11/29/2016.
 */
@BTrace
public class MemoryScript001 {

    @OnTimer(4000)
    public static void printMem() {
        println("Heap:");
        println(BTraceUtils.Sys.Memory.heapUsage());
        println("Non-Heap:");
        println(BTraceUtils.Sys.Memory.nonHeapUsage());
    }
}
