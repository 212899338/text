package com.sdzy.day01;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("������ɼ���");
		double score = scan.nextDouble();
		
		if(score>=0 || score<=100){
			if(score>=90){
				System.out.println("����");
			}else if (score>=80) {
				System.out.println("����");
			}else if (score>=70) {
				System.out.println("�е�");
			}else if (score>=60) {
				System.out.println("����");
			}else {
				System.out.println("������");
			}
		}else {
			System.out.println("�������");
		}
		
	}

}
