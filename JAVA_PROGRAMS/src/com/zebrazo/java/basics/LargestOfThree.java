package com.zebrazo.java.basics;

import java.util.Scanner;

public class LargestOfThree {
    
    void largestnum(int a, int b, int c) {
        if (a >= b && a >= c) {
            System.out.println(a);
        } else if (b >= a && b >= c) {
            System.out.println(b);
        } else {
            System.out.println(c);
        }
    }
    
    public static void main(String[] args) {
        LargestOfThree lt = new LargestOfThree();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the three variables: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        System.out.println("THE LARGEST OF THREE NUMBERS IS: ");
        lt.largestnum(x, y, z);
        sc.close();
    }
}
