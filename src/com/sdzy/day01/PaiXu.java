package com.sdzy.day01;

import java.util.Scanner;

public class PaiXu {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������������a,b,c(�Կո����)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		System.out.println("��������ǣ�a="+a+",b="+b+",c="+c);
		
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
		
		System.out.println("��������н����"+"a="+a+","+"b="+b+","+"c="+c);
		
	}

}
