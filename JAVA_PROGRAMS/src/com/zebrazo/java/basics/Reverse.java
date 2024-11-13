package com.zebrazo.java.basics;

import java.util.Scanner;

public class Reverse {
	
	void reverseTest (String s) {
		String[] list = s.split("");
		for(int i = list.length-1 ; i>=0;i--) {
			System.out.print(list[i]);	
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER A STRING : ");
		String s = sc.nextLine();
		Reverse r = new Reverse();
		r.reverseTest(s);
		sc.close();
	}

}
