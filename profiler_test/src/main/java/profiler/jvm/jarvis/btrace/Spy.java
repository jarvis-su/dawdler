package profiler.jvm.jarvis.btrace;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by C5023792 on 11/15/2016.
 */
public class Spy implements Runnable {

    static Map<String, String> commands = new HashMap<String, String>();

    static {
        commands.put("1", "profiler.jvm.jarvis.btrace.Foo1Command");
        commands.put("2", "profiler.jvm.jarvis.btrace.Foo2Command");
    }

    @Override
    public void run() {
        try {
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter Command: ");
            System.out.println("commands : " + commands);
            System.out.println("请验证下面两个场景：");
            System.out.println("场景一：加载Foo1；加载Agent；加载Foo2---结果：Foo1被拦截；Foo2未拦截");
            System.out.println("场景二：加载Agent；          加载Foo2---结果：Foo1被拦截；Foo2被拦截");
            for (String line; (line = in.readLine()) != null; ) {
                doAction(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void doAction(String action) throws Exception {
        String commandName = commands.get(action);
        if (commandName != null) {
            Command command = (Command) Class.forName(commandName).newInstance();
            command.execute();
        } else {
            System.out.println("invalid command..");
            System.out.println("commands : " + commands);
        }
    }
}
