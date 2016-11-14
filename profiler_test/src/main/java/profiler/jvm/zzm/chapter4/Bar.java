package profiler.jvm.zzm.chapter4;

public class Bar {
    static int b = 2;
    int a = 1;

    public static void main(String[] args) {
        new Bar().sum(3);
    }

    public int sum(int c) {
        return a + b + c;
    }
}

