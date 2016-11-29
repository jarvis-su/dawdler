package profiler.jvm.jarvis.btrace.ss2;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

@BTrace
public class BTraceTestScript001 {
    @OnMethod(
            clazz = "profiler.jvm.jarvis.btrace.ss2.Counter",
            method = "add",
            location = @Location(Kind.RETURN)
    )
    public static void traceExecute(int num, @Return int result) {
        println("====== ");
        println(strcat("parameter num: ", str(num)));
        println(strcat("return value:", str(result)));
    }
}
