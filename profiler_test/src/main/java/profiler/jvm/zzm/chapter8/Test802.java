
package profiler.jvm.zzm.chapter8;

public class Test802 {
    public static void main(String[] args) {
        {
            byte[] placeholder = new byte[64 * 1024 * 1024];
        }
        System.gc();
    }
}

