package com.sdzy.day01;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("«Î ‰»Î:");
		int num = scan.nextInt();
		
		switch (num) {
		case 1:
			System.out.println(111);
			break;
		case 2:
			System.out.println(222);
			break;
		case 3:
			System.out.println(333);
			break;
		case 4:
			System.out.println(444);
			break;
		case 5:
			System.out.println(555);
			break;
		case 6:
			System.out.println(666);
			break;
		case 7:
			System.out.println(777);
			break;
		case 8:
			System.out.println(888);
			break;
		case 9:
			System.out.println(999);
			break;

		default:
			System.out.println(000);
			break;
		}
		
	}

}
