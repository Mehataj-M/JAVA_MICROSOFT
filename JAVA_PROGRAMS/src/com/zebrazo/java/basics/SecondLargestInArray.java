package com.zebrazo.java.basics;

import java.util.Scanner;
import java.util.Arrays;
import java.util.List;

public class SecondLargestInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//getting the size of array
		System.out.println("ENTER A LIST SIZE : ");
		int size = sc.nextInt();
		
		//initializing the size
		int[] arr = new int[size];
		
		//getting the input for the array
		System.out.println("Enter the elements of the array: ");
		for(int i=0; i<size; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("");
		
		//sorting the array
		for(int i=0; i<size-1; i++) {
			for(int j=0; j<size-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		
		System.out.println("THE SECOND LARGEST ELEMENT OF THE ARRAY : " +arr[size-2]);
	
		sc.close();
	}

}


/*
 	public class SecondLargestInArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Getting the size of array
        System.out.println("ENTER A LIST SIZE : ");
        int size = sc.nextInt();

        // Initializing the size
        int[] arr = new int[size];

        // Getting the input for the array
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Finding the second largest element without sorting
        Integer first = null, second = null;
        for (int num : arr) {
            if (first == null || num > first) {
                second = first;
                first = num;
            } else if ((second == null || num > second) && num != first) {
                second = num;
            }
        }

        if (second != null) {
            System.out.println("THE SECOND LARGEST ELEMENT OF THE ARRAY : " + second);
        } else {
            System.out.println("The array does not have enough distinct elements to determine the second largest.");
        }

        sc.close();
    }
}

 */
