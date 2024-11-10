package com.zebrazo.java.basics;

import java.util.Scanner;

public class FibonacciSeries {
	
	void fibonacci_test(int num) {
		StringBuilder result = new StringBuilder();
		int a = 0, b = 1;
		if (num == 0) {
			System.out.println("nil");
		}
		else if (num == 1) {
			System.out.println(a);
		}
		else if (num == 2) {
			System.out.println(a+", "+b);
		}
		else {
			result.append(a);
			result.append(", ");
			result.append(b);
			for(int i=2; i<num; i++) {
				int temp = a+b;
				result.append(", ");
				result.append(temp);
				a = b;
				b = temp;
				temp = a;
			}
			System.out.println(result);
		}
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER : ");
		int num = sc.nextInt();
		FibonacciSeries fs = new FibonacciSeries();
		fs.fibonacci_test(num);
		sc.close();
	}

}
