package com.sdzy.day01;

import java.util.Scanner;

public class Score {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入成绩：");
		double score = scan.nextDouble();
		
		if(score>=0 || score<=100){
			if(score>=90){
				System.out.println("优秀");
			}else if (score>=80) {
				System.out.println("良好");
			}else if (score>=70) {
				System.out.println("中等");
			}else if (score>=60) {
				System.out.println("及格");
			}else {
				System.out.println("不及格");
			}
		}else {
			System.out.println("输入错误");
		}
		
	}

}
