package com.sdzy.day01;

import java.util.Scanner;

public class Bijiaodaxiao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("��������������������a,b(�Կո����)");
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		if(a>b){
			System.out.println("���ֵ��"+a);
		}else if(a<b){
			System.out.println("���ֵ��"+b);
		}

	}

}
