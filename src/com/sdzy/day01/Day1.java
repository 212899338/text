package com.sdzy.day01;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����:");
		double unitPrice = scan.nextDouble();
		
		System.out.println("����:");
		double amount = scan.nextDouble();
		
		System.out.println("���:");
		double money = scan.nextDouble();
		
		double totalPrice = unitPrice*amount;
		if(totalPrice>=500){
			totalPrice = totalPrice*0.8;
		}else if (totalPrice>=400) {
			totalPrice = totalPrice*0.9;
		}else if(totalPrice==499){
			totalPrice = totalPrice-100;
		}else if(totalPrice==399){
			totalPrice = totalPrice-50;
		}
		
		double moenye = money - totalPrice;
		if(moenye<=0){
			System.out.println("���Ǯ����,�����:"+moenye+"Ԫ");
		}else {
			System.out.println("�ܼ�:"+totalPrice+"���㣺"+moenye);
		}
		
	}

}
