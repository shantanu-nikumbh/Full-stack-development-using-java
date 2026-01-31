package com.info.java_basics;

import java.util.Scanner;

public class ArithematicOperation {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraction: " + (a - b));
        System.out.println("Multiplication: " + (a * b));
        System.out.println("Division: " + (a / b));
    }
}
