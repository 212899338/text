package com.sdzy.day01;

import java.util.Scanner;

public class PaiXu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请依次输入两个整数：a,b,c(以空格隔开)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("你输入的是：a="+a+",b="+b+",c="+c);
		
		int d;
		if(a>b){
			d=a;
			a=b;
			b=d;
		}
		if(a>c){
			d=a;
			a=c;
			c=d;
		}
		if(b>c){
			d=b;
			b=c;
			c=d;
		}
		
		System.out.println("升序后排列结果："+"a="+a+","+"b="+b+","+"c="+c);
		
	}

}
