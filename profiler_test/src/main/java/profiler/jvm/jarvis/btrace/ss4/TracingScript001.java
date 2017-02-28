package profiler.jvm.jarvis.btrace.ss4;


import static com.sun.btrace.BTraceUtils.jstack;
import static com.sun.btrace.BTraceUtils.println;
import static com.sun.btrace.BTraceUtils.str;
import static com.sun.btrace.BTraceUtils.strcat;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.Kind;
import com.sun.btrace.annotations.Location;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.Return;
import com.sun.btrace.annotations.Self;

/**
 * Created by Jarvis on 11/12/2016.
 */

@BTrace(unsafe=true)
public class TracingScript001 {

    /*指明要查看的方法，类*/
    @OnMethod(
            clazz = "profiler.jvm.jarvis.btrace.ss4.CaseObject",
            method = "execute",
            location = @Location(Kind.RETURN)
    )
    /*主要两个参数是对象自己的引用 和 返回值，其它参数都是方法调用时传入的参数*/
    public static void traceExecute(@Self profiler.jvm.jarvis.btrace.ss4.CaseObject object, int sleepTime, @Return boolean result) {
        println("调用堆栈！！");
        println(strcat("返回结果是：", str(result)));
        jstack();
        println(strcat("时间是：", str(sleepTime)));
    }

}
