package jarvis.test;

import jarvis.utils.PinyinTool;

/**
 * Created by C5023792 on 11/25/2016.
 */
public class PinyinToolTest {
    public static void main(String[] args) {
        PinyinTool tool = new PinyinTool();

        try {
            System.out.println(tool.toPinYin("苏杰"));
            System.out.println(tool.toPinYin("苏杰", "_"));
            System.out.println(tool.toPinYin("苏杰", "_", PinyinTool.Type.FIRSTUPPER));
            System.out.println(tool.toPinYin("苏杰", " ", PinyinTool.Type.FIRSTUPPER));
            System.out.println(tool.toPinYin("苏杰", "_", PinyinTool.Type.UPPERCASE));
        } catch (Exception e) {

        }

    }
}
