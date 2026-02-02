package com.info.exception;

import java.util.Scanner;

public class ThrowsKeyword {

    // Method declares that it may throw NullPointerException
    static void checkString(String str) throws NullPointerException {
        if (str == null) {
            throw new NullPointerException("String is null!");
        } else {
            System.out.println("String length: " + str.length());
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string (or type null): ");
        String input = sc.nextLine();

        // If user types "null", we treat it as null
        if (input.equals("null")) {
            input = null;
        }

        try {
            checkString(input); // may throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
