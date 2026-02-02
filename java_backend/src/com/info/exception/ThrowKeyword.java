package com.info.exception;

import java.util.Scanner;

public class ThrowKeyword {
    static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Age must be 18 or above");
        } else {
            System.out.println("You are eligible");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        try {
            checkAge(age);  // may throw exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}

