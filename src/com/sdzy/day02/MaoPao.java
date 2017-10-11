package com.sdzy.day02;

import java.util.Arrays;
import java.util.Random;

public class MaoPao {
    public static void main(String[] args) {
        int [] arr = new int[10];
        Random ran = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ran.nextInt(100);
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------Ã°ÅİÅÅĞò¿ªÊ¼-----------------");
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i -1; j++) {
                if (arr[j]>arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                }
                System.out.println(Arrays.toString(arr));
            }
            System.out.println("-----------------Ã°ÅİÅÅĞò½áÊø-----------------");
            System.out.println(Arrays.toString(arr));
        }
    }
}
