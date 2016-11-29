package profiler.jvm.zzm.chapter4;

/* BTrace Script Template */

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace(unsafe = true)
public class TracingScript {
    @OnMethod(
            clazz = "profiler.jvm.zzm.chapter4.BTraceTest002",
            method = "add",
            location = @Location(Kind.RETURN)
    )

    public static void func(@Self profiler.jvm.zzm.chapter4.BTraceTest instance, int a, int b, @Return int result) {
        println("调用堆栈:");
        jstack();
        println(strcat("方法参数A:", str(a)));
        println(strcat("方法参数B:", str(b)));
        println(strcat("方法结果:", str(result)));
    }
}

