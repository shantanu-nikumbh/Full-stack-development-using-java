package com.info.exception;

public class ArithmaticException {
	
	 public static void main(String[] args) {
	        try {
	            int a = 10;
	            int b = 0;
	            int c = a / b;  // division by zero
	            System.out.println("Result: " + c);
	        } catch (ArithmeticException e) {
	            System.out.println("Arithmetic Exception caught: " + e);
	        }
	    }
}
