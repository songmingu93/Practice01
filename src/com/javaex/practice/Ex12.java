package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		double won, dollar;
		final double Exchange = 1230.95;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("환전할 원화를 입력하세요 : ");
		
		won = sc.nextDouble();
		dollar = won / Exchange;
		
		System.out.println("받으실 달러는 "+ dollar);

		sc.close();
		}

	}