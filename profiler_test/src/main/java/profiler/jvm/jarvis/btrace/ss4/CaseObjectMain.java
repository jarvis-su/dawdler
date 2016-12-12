package profiler.jvm.jarvis.btrace.ss4;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class CaseObjectMain {
    private static Logger logger = LogManager.getLogger(CaseObjectMain.class.getName());

    int times = 10;

    public static void main(String[] args) {
        CaseObjectMain main = new CaseObjectMain();
        try {
            main.begin();
        } catch (Exception e) {
            logger.error(e.getMessage());
        }
    }

    public void begin() throws Exception {

        CaseObject object = new CaseObject();
        while (true) {
            times++;
            boolean result = doWork(object);
            Thread.sleep(1000);
        }
    }

    public boolean doWork(CaseObject object) throws Exception {
        Random random = new Random();

        boolean temp = object.execute(random.nextInt(1000));
        return temp;
    }

}