package jarvis;

import java.util.regex.Pattern;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        String params = "2016-01-02";

        Pattern p = Pattern.compile("\\d{4}-\\d{2}-\\d{2}");
        if (p.matcher(params).matches()) {
            System.out.println("Hello World!");
        }
    }
}
