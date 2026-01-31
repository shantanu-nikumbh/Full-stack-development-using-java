package com.info.java_basics;

import java.util.Scanner;

public class SwapNumbers2 {
	
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.println("Enter number 1 : ");
	        int a = sc.nextInt();
	        
	        System.out.println("Enter number 2 : ");
	        int b = sc.nextInt();

	        a = a + b;
	        b = a - b;
	        a = a - b;

	        System.out.println("After swap:");
	        System.out.println("a = " + a);
	        System.out.println("b = " + b);
	    }
}
