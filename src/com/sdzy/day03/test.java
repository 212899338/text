package com.sdzy.day03;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int score = 0;//�ܷ�
        for (int i = 1; i <= 1000; i++) {
            double a = (int)(Math.random()*100);
            double b = (int)(Math.random()*100);
            int c = (int)(Math.random()*3);
            Scanner scan = new Scanner(System.in);
            if (c == 0) {
                System.out.println(a+"+"+b+"="+"?");
                System.out.println("�������");
                int e = scan.nextInt();
                if(e == a+b){
                    System.out.println("�����");
                    score += 10;
                }else {
                    System.out.println("�����");
                    break;
                }
            }else if (c == 1){
                System.out.println(a+"-"+b+"="+"?");
                System.out.println("�������");
                int e = scan.nextInt();
                if(e == a-b && a-b>=0){
                    System.out.println("�����");
                    score += 10;
                }else {
                    System.out.println("�����");
                    break;
                }
            }else if (c == 2){
                System.out.println(a+"*"+b+"="+"?");
                System.out.println("�������");
                int e = scan.nextInt();
                if(e == a*b){
                    System.out.println("�����");
                    score += 10;
                }else {
                    System.out.println("�����");
                    break;
                }
            }
            System.out.println("����Ϊ" + score);
        }

    }
}
