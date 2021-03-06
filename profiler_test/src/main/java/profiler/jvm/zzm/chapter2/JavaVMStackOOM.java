package profiler.jvm.zzm.chapter2;

/**
 * VM Args：-Xss2M （这时候不妨设大些）
 *
 * @author zzm
 */
public class JavaVMStackOOM {

    public static void main(String[] args) throws Throwable {
        JavaVMStackOOM oom = new JavaVMStackOOM();
        oom.stackLeakByThread();
    }

    private void dontStop() {
        while (true) {
        }
    }

    public void stackLeakByThread() {
        while (true) {
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    dontStop();
                }
            });
            thread.start();
        }
    }
}

