package com.zebrazo.java.basics;

import java.util.Scanner;

public class GCD {
	
	// finding maximum
	void max(int a, int b) {
		int m;
		if(a>b) {
			 m = b;
		}
		else {
			 m = a;
		}
		
		//finding GCD
		for(int i=m; i>0; i--) {
			int x=a%i;
			int y=b%i;
			if(x==0 && y==0) {
				System.out.println("THE GREATEST COMMON DIVISOR IS : " +i);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER TWO NUMBER : ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		GCD g = new GCD();
		g.max(a,b);
		sc.close();
	}

}


/*
 	package com.zebrazo.java.basics;

	import java.util.Scanner;
	
	public class GCD {
	    
	    // Finding GCD using Euclidean algorithm
	    void findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        System.out.println("THE GREATEST COMMON DIVISOR IS : " + a);
	    }
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("ENTER TWO NUMBER : ");
	        int a = sc.nextInt();
	        int b = sc.nextInt();
	        GCD g = new GCD();
	        g.findGCD(a, b);
	        sc.close();
	    }
	}

*/