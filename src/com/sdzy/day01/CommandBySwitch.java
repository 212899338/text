package com.sdzy.day01;

import java.util.Scanner;

public class CommandBySwitch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("�����룺1.��ʾȫ����¼��2.��ѯ��¼��3.�˳�");
		int command = scan.nextInt();
		
		if (command==1) {
			System.out.println("��ʾȫ����¼");
		} else if(command==2){
			System.out.println("��ѯ��¼");
		}else if (command==3) {
			System.out.println("�˳�");
		}else {
			System.out.println("�������");
		}
		
		/*switch (command) {
		case 1:
			System.out.println("��ʾȫ����¼");
			break;
		case 2:
			System.out.println("��ѯ��¼");
			break;
		case 3:
			System.out.println("�˳�");
			break;
		default:
			System.out.println("�������");
			break;
		}*/
		
	}

}
