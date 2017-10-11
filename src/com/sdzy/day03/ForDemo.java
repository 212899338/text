package com.sdzy.day03;

import java.util.Random;

public class ForDemo {
    public static void main(String[] args) {
        int a = (int) (Math.random()*999999);
        for (int i = 1; i < a; i++) {
            if (i%10 == 3) {
                continue;
            }
            i = i+a;
            System.out.println(i);
        }
    }
}
