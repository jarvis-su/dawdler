package profiler.jvm.zzm.chapter13;

import java.util.Vector;

public class Test1303 {

    public static void main(String[] args) {

    }

    public void removeThread(Vector vector) {
        Thread removeThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        vector.remove(i);
                    }
                }
            }
        });
    }

    public void printThread(Vector vector) {
        Thread printThread = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (vector) {
                    for (int i = 0; i < vector.size(); i++) {
                        System.out.println((vector.get(i)));
                    }
                }
            }
        });
    }
}