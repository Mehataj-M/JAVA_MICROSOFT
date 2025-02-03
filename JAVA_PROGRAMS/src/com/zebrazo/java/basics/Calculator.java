package com.zebrazo.java.basics;

import java.util.Scanner;

public class Calculator {
	
	void add(int a, int b) {
		int total = a+b;
		System.out.println("THE ANSWER AFTER ADDITION IS: " +total);
	}
	void sub(int a, int b) {
		int total = a-b;
		System.out.println("THE ANSWER AFTER ADDITION IS: " +total);
	}
	void mul(int a, int b) {
		int total = a+b;
		System.out.println("THE ANSWER AFTER ADDITION IS: " +total);
	}
	void div(int a, int b) {
		int total = a+b;
		System.out.println("THE ANSWER AFTER ADDITION IS: " +total);
	}
	void mod(int a, int b) {
		int total = a+b;
		System.out.println("THE ANSWER AFTER ADDITION IS: " +total);
	}
	void pow(int a, int b) {
		int total = Math.pow(a,b); //(base,exponent)
		System.out.println("THE ANSWER AFTER ADDITION IS: " +total);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER TWO NUMBER : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
	}

}
 