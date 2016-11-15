package com.jarvis.thread;

import com.jarvis.entity.Student;

import java.util.Vector;

public class ThreadTest {

    static Vector<Student> studentList = new Vector<>();

    public static void main(String[] args) {
        while (true) {
            for (int i = 0; i < 100; i++) {
                Student stu = new Student();
                stu.setName("Test" + String.valueOf(i));
                studentList.add(stu);
            }

            Thread removeThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < studentList.size(); i++) {
                        studentList.remove(i);
                    }
                }
            });

            Thread printThread = new Thread(new Runnable() {
                @Override
                public void run() {
                    for (int i = 0; i < studentList.size(); i++) {
                        System.out.println((studentList.get(i).getName()));
                    }
                }
            });

            removeThread.start();
            printThread.start();

            System.out.println("Currently, there are " + Thread.activeCount() + " active threads !");

            //不要同时产生过多的线程，否则会导致操作系统假死
            while (Thread.activeCount() > 20) ;
        }
    }


}
