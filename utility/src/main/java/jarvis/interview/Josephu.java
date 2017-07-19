package jarvis.interview;

/**
 * 约瑟夫环：15个基督教徒和15个非教徒在海上遇险，必须将其中一半的人投入海中，其余的人才能幸免于难，于是30个人围成一圈，从某一个人开始从1报数，报到9的人就扔进大海，他后面的人继续从1开始报数，重复上面的规则，直到剩下15个人为止。结果由于上帝的保佑，15个基督教徒最后都幸免于难，问原来这些人是怎么排列的，哪些位置是基督教徒，哪些位置是非教徒。
 */
public class Josephu {
    private static final int DEAD_NUM = 9;

    public static void main(String[] args) {
        boolean[] persons = new boolean[30];
        for (int i = 0; i < persons.length; i++) {
            persons[i] = true;
        }

        int counter = 0;
        int claimNumber = 0;
        int index = 0;
        while (counter < 15) {
            if (persons[index]) {
                claimNumber++;
                if (claimNumber == DEAD_NUM) {
                    counter++;
                    claimNumber = 0;
                    persons[index] = false;
                }
            }
            index++;
            if (index >= persons.length) {
                index = 0;
            }
        }
        for (boolean p : persons) {
            if (p) {
                System.out.print("基");
            } else {
                System.out.print("非");
            }
        }
    }
}
