package com.sdzy.day01;

import java.util.Scanner;

public class RunOld {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����룺");
		int old = scan.nextInt();
		
		if((old%4==0 && old%100!=0) || old%400==0 ){
			System.out.println(old+"������");
		}else {
			System.out.println(old+"��������");
		}
	}

}
