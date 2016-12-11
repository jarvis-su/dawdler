package profiler.jvm.jarvis.btrace.ss4;


import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

/**
 * Created by Jarvis on 11/12/2016.
 */

@BTrace
public class TracingScript001 {
    /* put your code here */
/*指明要查看的方法，类*/
    @OnMethod(
            clazz = "baby.btrace.CaseObject",
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
