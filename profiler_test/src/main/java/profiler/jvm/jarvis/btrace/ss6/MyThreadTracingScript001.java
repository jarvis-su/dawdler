package profiler.jvm.jarvis.btrace.ss6;

import static com.sun.btrace.BTraceUtils.println;

import java.lang.management.MemoryUsage;

import com.sun.btrace.BTraceUtils.D;
import com.sun.btrace.BTraceUtils.Sys;
import com.sun.btrace.BTraceUtils.Threads;
import com.sun.btrace.BTraceUtils.Time;
import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnLowMemory;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.OnTimer;
import com.sun.btrace.annotations.Self;

/**
 * Created by Jarvis on 13/12/2016.
 * -Xshare:off -javaagent:/Users/Jarvis/external_bin/btrace-bin-1.3.8.3/build/btrace-agent.jar=script=/Users/Jarvis/Documents/workspace/dawdler/profiler_test/target/classes/profiler/jvm/jarvis/btrace/ss6/MyThreadTracingScript001.class,debug=true,unsafe=true,dumpClasses=true,stdout=true
 */
@BTrace(unsafe = true)
public class MyThreadTracingScript001 {

    /****************************************/
    static {
        println("vm version " + Sys.VM.vmVersion());
        println("vm starttime " + Sys.VM.vmStartTime());
    }

    /****************************************/
    @OnLowMemory(
            pool = "Tenured Gen",
            threshold = 6000000
    )
    public static void onLowMem(MemoryUsage mu) {
        println(mu);
    }

    /****************************************/

    @OnTimer(4000)
    public static void printMem() {
        println("Heap:");
        println(Sys.Memory.heapUsage());
        println("Non-Heap:");
        println(Sys.Memory.nonHeapUsage());
    }

    /****************************************/

    @OnMethod(
            clazz = "java.lang.Thread",
            method = "start"
    )
    public static void onnewThread(@Self Thread t) {
        D.probe("jthreadstart", Threads.name(t));
        println("starting " + Threads.name(t));
    }

    @OnTimer(1000)
    public static void f() {
        println("1000 msec: " + Sys.VM.vmUptime());
    }

    @OnTimer(3000)
    public static void f1() {
        println("3000 msec: " + Time.millis());
    }

    /****************************************/


}
