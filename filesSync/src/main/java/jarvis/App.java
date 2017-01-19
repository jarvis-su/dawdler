package jarvis;

import jarvis.utils.FilesUtils;

import java.io.File;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    static long MIN_FILE_SIZE = 10*1024*1024;
    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<File> files = null;
        files = FilesUtils.getAllFiles("E:\\House.of.Cards");
        files = FilesUtils.getAllFiles("G:\\迅雷下载");
        files = FilesUtils.getAllFiles("F:\\X-Man");
        files = FilesUtils.getAllFiles("G:\\Sunny");
        files = FilesUtils.getAllFiles("J:\\778802\\tmp");


        long fileCount = 0;
        for (File f : files) {
            if (f.exists() && f.isFile()) {
                fileCount++;
                long fileSize = FilesUtils.getFileSize(f);
                System.out.println(f.getAbsolutePath() + " size is " + fileSize);
                if(fileSize >=MIN_FILE_SIZE){
                    FilesUtils.moveToDest(f,"J:\\778802\\files");
                }
            }
        }
        System.out.println("Total count " + fileCount);
    }
}
