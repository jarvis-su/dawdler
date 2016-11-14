package com.jarvis;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jarvis on 10/11/2016.
 */
public class App1 {
    static List<Book> test = new ArrayList<>();

    public static void main(String[] args) {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            System.out.println(i);
            test.add(new Book());
        }
    }
}
