package profiler.jvm.jarvis.btrace.ss5;

/**
 * Created by C5023792 on 12/12/2016.
 */
public class TestItem {
    private int id;
    private String name;
    private byte context;

    private static final int _1MB = 1024 * 1024;
    private static final int SIZE = 1;
    private byte[] bigSize = new byte[SIZE * _1MB];

    public TestItem() {

    }

    public TestItem(int id, String name, byte context) {
        this.id = id;
        this.name = name;
        this.context = context;
        this.bigSize = bigSize = new byte[SIZE * _1MB];
    }
}
