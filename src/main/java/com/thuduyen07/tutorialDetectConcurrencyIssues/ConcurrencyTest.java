package com.thuduyen07.tutorialDetectConcurrencyIssues;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ConcurrencyTest {
    static final List a = Collections.synchronizedList(new ArrayList());

    public static void main(String[] args) throws InterruptedException {
            Thread t = new Thread();
            t.start();
            addIfAbsent(17);
            t.join();
            System.out.println(a.size());
    }

    private static void addIfAbsent(int i) {
        if (!a.contains(i)) {
            a.add(i);
        }
    }


}
