package com.jarvis.entity;

/**
 * Created by C5023792 on 11/15/2016.
 */
public class Student {

    private static final int _1MB = 1024 * 1024;
    private static final int SIZE = 1;
    private byte[] bigSize = new byte[SIZE * _1MB];

    private String no;
    private String name;

    public Student() {
        this.bigSize = new byte[SIZE * _1MB];
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
