package com.sdzy.day03;

import java.util.Scanner;

public class SuanTi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;//总分
        System.out.println("答题开始：");
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 100);//随机产生加数
            int b = (int) (Math.random() * 100);//随机产生被加数
            int c = a + b;//正确答案
            System.out.println("(" + i + ")" + a + "+" + b + "=" + "?");//输出算式
            System.out.println("开始算吧:");
            int answer = scan.nextInt();//输入答案
            if (answer == -1) {
                break;
            }
            if (c == answer) {//判断计算机答案是否与输入答案相符
                score += 10;//总分相加
                System.out.println("答对了");
            } else {
                System.out.println("答错了");
            }
        }
        System.out.println("分数为" + score);
    }
}
