package profiler.jvm.jarvis.btrace.ss6;

/**
 * Created by Jarvis on 12/12/2016.
 */
public class RunnableDemo {
    public static void main(String[] args) {
        //设计三个线程
        RunnableThread mt = new RunnableThread();
        Thread t1 = new Thread(mt, "一号窗口");
        Thread t2 = new Thread(mt, "二号窗口");
        Thread t3 = new Thread(mt, "三号窗口");
//         RunnableThread mt2 = new RunnableThread();
//         RunnableThread mt3 = new RunnableThread();
        t1.start();
        t2.start();
        t3.start();
    }
}
