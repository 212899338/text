package com.sdzy.day03;

import java.util.Scanner;

public class SuanTi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;//�ܷ�
        System.out.println("���⿪ʼ��");
        for (int i = 1; i <= 10; i++) {
            int a = (int) (Math.random() * 100);//�����������
            int b = (int) (Math.random() * 100);//�������������
            int c = a + b;//��ȷ��
            System.out.println("(" + i + ")" + a + "+" + b + "=" + "?");//�����ʽ
            System.out.println("��ʼ���:");
            int answer = scan.nextInt();//�����
            if (answer == -1) {
                break;
            }
            if (c == answer) {//�жϼ�������Ƿ�����������
                score += 10;//�ܷ����
                System.out.println("�����");
            } else {
                System.out.println("�����");
            }
        }
        System.out.println("����Ϊ" + score);
    }
}
