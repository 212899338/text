package com.sdzy.day01;

import java.util.Scanner;

public class Days {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("�������꣺");
		int old = scan.nextInt();
		System.out.println("�������£�");
		int month = scan.nextInt();
		int days;
		
		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			days = 31;
			System.out.println(old+"��"+month+"����"+days+"��");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			days = 30;
			System.out.println(old+"��"+month+"����"+days+"��");
			break;
		case 2:
			if((old%4==0 && old%100!=0) || old%400==0 ){
				days= 29;
				System.out.println(old+"��"+month+"����"+days+"��");
			}else {
				days= 28;
				System.out.println(old+"��"+month+"����"+days+"��");
			}
		}
	}

}
