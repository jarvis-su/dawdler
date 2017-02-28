package profiler.jvm.jarvis.btrace.ss6;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import profiler.jvm.jarvis.btrace.ss5.TestItem;

/**
 * Created by Jarvis on 12/12/2016.
 */
public class MyThread extends Thread {

    public static List<TestItem> list = new ArrayList<>();
    private static Logger logger = LogManager.getLogger(MyThread.class.getName());
    private int ticket = 10;
    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    public void run() {
        for (int i = 0; i < 500; i++) {
            if (this.ticket > 0) {
                logger.log(Level.INFO, this.name + "卖票---->" + (this.ticket--));
            }
        }
    }

    public void addItems() {
        list.add(new TestItem());
    }

    public void removeLastItem() {
        if (null != list && list.size() > 0) {
            list.remove(list.size() - 1);
        }
    }
}