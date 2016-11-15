package profiler.jvm.jarvis.btrace;

import java.lang.management.ManagementFactory;

/**
 * Created by C5023792 on 11/15/2016.
 */
public class HostMain {
    public static void main(String[] args) {
        System.out.println("pid = " + getSelfPID());
        new Thread(new Spy()).start();
    }
    static String getSelfPID() {
        String pname = ManagementFactory.getRuntimeMXBean().getName();
        int index = pname.indexOf('@');
        if (index == -1) {
            throw new RuntimeException("获取自身进程PID失败！进程名称为：" + pname);
        }
        String pid = pname.substring(0, index);
        return pid;
    }
}
