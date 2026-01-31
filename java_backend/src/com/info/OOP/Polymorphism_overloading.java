package com.info.OOP;


class Add {
    int sum(int a, int b) {
        return a + b;
    }

    int sum(int a, int b, int c) {
        return a + b + c;
    }
}

public class Polymorphism_overloading {
	public static void main(String[] args) {
        Add obj = new Add();
        System.out.println(obj.sum(5, 10));
        System.out.println(obj.sum(5, 10, 15));
    }
}
