package profiler.jvm.jarvis.btrace.ss6;

import java.util.Random;

/**
 * Created by Jarvis on 12/12/2016.
 */
public class MyThreadDemo {

    public static void main(String[] args) {

        MyThread mt1 = new MyThread("一号窗口");
        MyThread mt2 = new MyThread("二号窗口");
        MyThread mt3 = new MyThread("三号窗口");
        Random random = new Random();
        while (true) {
            int i = random.nextInt(100);
            if (i % 2 == 0) {
                mt1.start();
            }
            if (i % 3 == 0) {
                mt2.start();
            }
            mt3.start();
        }
    }
}
