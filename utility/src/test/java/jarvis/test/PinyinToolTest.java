package jarvis.test;

import jarvis.utils.PinyinTool;

/**
 * Created by C5023792 on 11/25/2016.
 */
public class PinyinToolTest {
    public static void main(String[] args) {
        PinyinTool tool = new PinyinTool();
        String hanZi = "虤,掱-不对,嬲,姧";

        try {
            System.out.println(tool.toPinYin(hanZi));
            System.out.println(tool.toPinYin(hanZi, " "));
            System.out.println(tool.toPinYin(hanZi, " ", PinyinTool.Type.FIRSTUPPER));
            System.out.println(tool.toPinYin(hanZi, " ", PinyinTool.Type.FIRSTUPPER));
            System.out.println(tool.toPinYin(hanZi, " ", PinyinTool.Type.UPPERCASE));
        } catch (Exception e) {

        }

    }
}
