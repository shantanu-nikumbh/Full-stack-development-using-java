package com.info.OOP;

class ParentClass {
    void show() {
        System.out.println("Parent class");
    }
}

class Child1 extends ParentClass {
    void display1() {
        System.out.println("Child1 class");
    }
}

class Child2 extends ParentClass {
    void display2() {
        System.out.println("Child2 class");
    }
}

public class Heirarchical_Inheritance {
	public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.show();
        c1.display1();

        Child2 c2 = new Child2();
        c2.show();
        c2.display2();
    }
}
