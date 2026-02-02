package com.info.exception;

import java.util.Scanner;

public class ExceptionBasic {
	
	public static void main(String args[]) {
		 try {
	            Scanner sc = new Scanner(System.in);
	            System.out.print("Enter a number: ");
	            int num = sc.nextInt();
	            System.out.println("You entered: " + num);
	        } catch (Exception e) {
	            System.out.println("Something went wrong: " + e);
	        } finally {
	            System.out.println("This block always executes");
	        }
	}
}
