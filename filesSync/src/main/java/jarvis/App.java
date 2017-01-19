package jarvis;

import jarvis.utils.FilesUtils;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<File> files = FilesUtils.getAllFiles("I:\\Pic");
        for (File f : files) {
            System.out.println(f.getAbsolutePath() + " size is " + FilesUtils.getFileSize(f));
        }
    }
}
