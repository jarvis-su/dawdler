package profiler.jvm.jarvis.btrace.ss3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by C5023792 on 11/29/2016.
 */
public class Test_3001 {

    private static List<String> list = new ArrayList<>();

    public static void main(String[] args) {

        Random random = new Random();

        while (true) {
            int i = random.nextInt(100);
            list.add("String " + Integer.toString(i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
