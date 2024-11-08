package com.zebrazo.java.basics;

import java.util.Scanner;

public class OddOrEven {
    
    void OddEven(int x) {
        if (x % 2 == 0) {
            System.out.println("THE GIVEN NUMBER IS EVEN");
        } else {
            System.out.println("THE GIVEN NUMBER IS ODD");
        }
    }
    
    public static void main(String[] args) {
        OddOrEven oe = new OddOrEven();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a value: ");
        int x = sc.nextInt();
        oe.OddEven(x);
        sc.close();
    }
}
