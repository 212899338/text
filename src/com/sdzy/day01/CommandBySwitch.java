package com.sdzy.day01;

import java.util.Scanner;

public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入：1.显示全部记录，2.查询记录，3.退出");
		int command = scan.nextInt();
		
		if (command==1) {
			System.out.println("显示全部记录");
		} else if(command==2){
			System.out.println("查询记录");
		}else if (command==3) {
			System.out.println("退出");
		}else {
			System.out.println("输入错误");
		}
		
		/*switch (command) {
		case 1:
			System.out.println("显示全部记录");
			break;
		case 2:
			System.out.println("查询记录");
			break;
		case 3:
			System.out.println("退出");
			break;
		default:
			System.out.println("输入错误");
			break;
		}*/
		
	}

}
