package profiler.jvm.jarvis.btrace.ss1;

import com.sun.btrace.AnyType;
import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;
import profiler.jvm.jarvis.tmp.Foo1Command;

@BTrace(unsafe = true)
public class SampleScript {

    @TLS
    // 在转换后的Script脚本类中，@TLS变量会自动声明为ThreadLocal变量
    static Object fooParam;

    @OnMethod(clazz = "/my\\..*?Command/", method = "execute", type = "void(my.FooParam)")
    public static void onExecute(@ProbeClassName
                                         String className, AnyType fooParam) {
        SampleScript.fooParam = fooParam;
    }

    @OnMethod(clazz = "/my\\..*?Command/", method = "execute", location = @Location(Kind.RETURN), type = "void(my.FooParam)")
    public static void onExecuteReturn(@ProbeClassName
                                               String className) {
        BTraceUtils.println("execute return : className = " + className);
        BTraceUtils.println("param : fooParam = " + fooParam);
        // 这儿引用Foo1Command不会有问题
        Foo1Command command = new Foo1Command();
        System.out.println(command.toString());
        // 在test()引用Foo1Command将抛出NoClassDefFoundError
        test();
    }

    @OnMethod(clazz = "/my\\..*?Command/", method = "execute", location = @Location(Kind.ERROR), type = "void(my.FooParam)")
    public static void onExecuteError(@ProbeClassName
                                              String className, Throwable e) {
        BTraceUtils.println("execute error : className = " + className);
        BTraceUtils.println("param : fooParam = " + fooParam);
        BTraceUtils.println("throw : message = " + e.getMessage());
    }

    public static void test() {
        System.out.println("test...");
        // 将抛出NoClassDefFoundError
        Foo1Command command = new Foo1Command();
        System.out.println(command.toString());
    }
}