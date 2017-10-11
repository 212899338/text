package com.sdzy.day01;

import java.util.Scanner;

public class Bijiaodaxiao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入两个整数：a,b(以空格隔开)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b){
			System.out.println("最大值是"+a);
		}else if(a<b){
			System.out.println("最大值是"+b);
		}

	}

}
