package com.sdzy.day01;

import java.util.Scanner;

public class Day1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("单价:");
		double unitPrice = scan.nextDouble();
		
		System.out.println("数量:");
		double amount = scan.nextDouble();
		
		System.out.println("金额:");
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
			System.out.println("你的钱不够,请缴纳:"+moenye+"元");
		}else {
			System.out.println("总价:"+totalPrice+"找零："+moenye);
		}
		
	}

}
