package com.zebrazo.java.basics;

import java.util.Scanner;

public class Armstrong {
	void test(int num) {
		int temp = num;
		int t = num;
		int count=0;
		int total=0;
		while(num > 0) {
			int n = num%10;
			count ++;
			num /= 10;
		}
		System.out.println("count=" +count);
		for(int i=0; i<count;i++) {
			// 123 = 3^3 + 2^3 + 1^3
			int n = temp%10;
			total += Math.pow(n, count);
			temp/=10;
		}
		System.out.println("total=" +total);
		if(t == total) {
			System.out.println("THE NUMBER IS ARMSTRONG NUMBER");
		}
		else {
			System.out.println("THE NUMBER IS NOT AN ARMSTRONG NUMBER");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A NUMBER : ");
		int num = sc.nextInt();
		Armstrong a = new Armstrong();
		a.test(num);
		
		sc.close();
	}

}
