package com.zebrazo.java.basics;

import java.util.Scanner;

public class Factorial {

	void test(int num) {
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact = fact*i;
		}
		System.out.printf("THE FACTORIAL OF GIVEN NUM IS : %d", fact);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER A NUMBER TO FIND FACTORIAL : ");
		Scanner sc = new Scanner(System.in);
		Factorial f = new Factorial();
		int num = sc.nextInt();
		f.test(num);
		sc.close();
	}

}
