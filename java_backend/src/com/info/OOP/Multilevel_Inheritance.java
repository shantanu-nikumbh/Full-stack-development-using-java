package com.info.OOP;

class A {
    void methodA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void methodB() {
        System.out.println("Class B");
    }
}

class C extends B {
    void methodC() {
        System.out.println("Class C");
    }
} 

public class Multilevel_Inheritance {
	public static void main(String[] args) {
        C obj = new C();
        obj.methodA();
        obj.methodB();
        obj.methodC();
    }
}
