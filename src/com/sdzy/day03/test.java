package com.sdzy.day03;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int score = 0;//总分
        for (int i = 1; i <= 1000; i++) {
            double a = (int)(Math.random()*100);
            double b = (int)(Math.random()*100);
            int c = (int)(Math.random()*3);
            Scanner scan = new Scanner(System.in);
            if (c == 0) {
                System.out.println(a+"+"+b+"="+"?");
                System.out.println("请输入答案");
                int e = scan.nextInt();
                if(e == a+b){
                    System.out.println("答对了");
                    score += 10;
                }else {
                    System.out.println("答错了");
                    break;
                }
            }else if (c == 1){
                System.out.println(a+"-"+b+"="+"?");
                System.out.println("请输入答案");
                int e = scan.nextInt();
                if(e == a-b && a-b>=0){
                    System.out.println("答对了");
                    score += 10;
                }else {
                    System.out.println("答错了");
                    break;
                }
            }else if (c == 2){
                System.out.println(a+"*"+b+"="+"?");
                System.out.println("请输入答案");
                int e = scan.nextInt();
                if(e == a*b){
                    System.out.println("答对了");
                    score += 10;
                }else {
                    System.out.println("答错了");
                    break;
                }
            }
            System.out.println("分数为" + score);
        }

    }
}
