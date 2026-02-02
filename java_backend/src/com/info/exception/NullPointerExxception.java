package com.info.exception;

public class NullPointerExxception {
	
	public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.length());  // accessing length of null
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e);
        }
    }
}
