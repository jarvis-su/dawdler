package jarvis;

import java.io.File;
import java.util.List;

import jarvis.utils.FilesUtils;

/**
 * Hello world!
 */
public class App {
    static long MIN_FILE_SIZE = 10 * 1024 * 1024;

    public static void main(String[] args) {
        System.out.println("Hello World!");
        List<File> files = null;
        files = FilesUtils.getAllFiles("E:\\House.of.Cards");
        files = FilesUtils.getAllFiles("F:\\X-Man");
        files = FilesUtils.getAllFiles("G:\\Sunny");
        files = FilesUtils.getAllFiles("J:\\778802\\tmp");
        files = FilesUtils.getAllFiles("G:\\TDownload");


        long fileCount = 0;
        for (File f : files) {
            if (f.exists() && f.isFile()) {
                fileCount++;
                long fileSize = FilesUtils.getFileSize(f);
                System.out.println(f.getAbsolutePath() + " size is " + fileSize);
                String fileName = f.getName();
                if (fileSize >= MIN_FILE_SIZE) {
                    if (fileName.endsWith("xltd")) {
                        System.out.println(fileName + " is not completed ");
                    } else {
                        System.out.println(fileName + " is  completed ");
                        FilesUtils.moveToDest(f, "E:\\tmp");
                    }
                } else if(!fileName.endsWith("xltd")){
                    System.out.println(fileName + " is  not needed, deleted it ! ");
                    FilesUtils.removeFile(f);
                }
            }
            if(FilesUtils.isEmptyFolder(f)){
                System.out.println(f.getName() + " is empty folder, delete it ");
                FilesUtils.removeFile(f);
            }
        }
        System.out.println("Total count " + fileCount);
    }
}
