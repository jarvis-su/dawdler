package profiler.jvm.jarvis.btrace.ss2;

import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.str;
import static com.sun.btrace.BTraceUtils.strcat;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;

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
