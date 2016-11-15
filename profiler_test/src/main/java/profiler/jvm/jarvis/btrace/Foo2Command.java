package profiler.jvm.jarvis.btrace;

/**
 * Created by C5023792 on 11/15/2016.
 */
public class Foo2Command implements Command {
    @Override
    public void execute() {
        System.out.println("foo2 command execute...");
    }
}
