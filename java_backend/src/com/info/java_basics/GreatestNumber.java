package com.info.java_basics;

import java.util.Scanner;

public class GreatestNumber {
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number 1 : ");
        int a = sc.nextInt();
        
        System.out.println("Enter number 2 : ");
        int b = sc.nextInt();
        
        System.out.println("Enter number 3 : ");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("Greatest: " + a);
        }else if (b > c) {
            System.out.println("Greatest: " + b);
        }else {
            System.out.println("Greatest: " + c);
        }
    }
}
