package com.javaex.practice;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
	
		Scanner sc = new Scanner(System.in);
		int pay, overpay;
		
		System.out.println("월급을 입력하세요 : ");

		pay= sc.nextInt();
		
		overpay = pay * 12 * 10; //월급 * 12개월 * 10년
		
		System.out.println("10년동안 최대 저축액은 " + overpay +"원 입니다.");
		
		sc.close();
	}
}