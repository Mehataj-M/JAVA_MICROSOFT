package com.zebrazo.java.basics;

import java.util.Scanner;

public class Palindrome {

	void test(String s) {
		String word = "";
		for(int i=s.length()-1; i>=0; i--) {
			char ch = s.charAt(i);
			word = word + ch;
		}
		System.out.println(word);
		
		if( s.equals(word) ) {
			System.out.println("THE GIVEN STRING IS PALINDROME");
		}
		else {
			System.out.println("THE GIVEN STRING IS NOT A PALINDROME");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ENTER A STRING : ");
		Scanner sc = new Scanner(System.in);
		Palindrome p = new Palindrome();
		String s = sc.nextLine();
		p.test(s);
		sc.close();
	}

}
