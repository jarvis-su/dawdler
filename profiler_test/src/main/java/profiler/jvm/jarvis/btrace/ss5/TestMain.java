package profiler.jvm.jarvis.btrace.ss5;

import java.util.ArrayList;
import java.util.List;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Created by C5023792 on 12/12/2016.
 */
public class TestMain implements Runnable {
    private static Logger logger = LogManager.getLogger(TestMain.class.getName());
    private static List<TestItem> list = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            try {
                Thread.sleep(1000);
                addItems();
                logger.log(Level.INFO, "Size is " + list.size());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

    public static void addItems() {
        list.add(new TestItem());
    }

    public static void removeLastItem() {
        if (null != list && list.size() > 0) {
            list.remove(list.size() - 1);
        }
    }

    @Override
    public void run() {

    }
}
