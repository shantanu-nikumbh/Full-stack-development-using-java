package com.info.OOP;


abstract class Customer {
    abstract void purchase();  // abstract method

    void details() {           // normal method
        System.out.println("Customer details");
    }
}

class RegularCustomer extends Customer {
    @Override
    void purchase() {
        System.out.println("Regular customer makes a purchase");
    }
}

public class Abstraction {
	 public static void main(String[] args) {
	        Customer c = new RegularCustomer();
	        c.details();
	        c.purchase();
	    }
}
