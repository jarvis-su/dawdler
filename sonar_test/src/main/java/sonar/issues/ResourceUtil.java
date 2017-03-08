package sonar.issues;

/**
 * Created by C5023792 on 7/28/2016.
 */
public class ResourceUtil {

    public static void releaseResource(AutoCloseable... closeableResource) {
    }

    public String testCC(int i) {
        if (i % 2 == 0) {
            if (i == 1) {
                return String.valueOf(i + 2);
            }

            return "1";
        } else {
            return String.valueOf(i);
        }

    }
}
