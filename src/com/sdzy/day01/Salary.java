package com.sdzy.day01;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入您的工资：");
		double salary = scan.nextDouble();
		double taxSalary = salary - 3500;
		double tax = 0.0;
		
		if(taxSalary<=0){
			tax = 0.0;
			System.out.println("不纳税");
		}else if (taxSalary<=1500) {
			tax =taxSalary*0.03-0;
			System.out.println(tax);
		}else if (taxSalary<=4500) {
			tax = taxSalary*0.1-105;
			System.out.println(tax);
		}else if(taxSalary<=9000){
			tax = taxSalary*0.2-555;
			System.out.println(tax);
		}

	}

}
