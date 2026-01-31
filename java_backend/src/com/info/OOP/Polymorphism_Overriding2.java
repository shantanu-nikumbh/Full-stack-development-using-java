package com.info.OOP;

class Shape {
    void draw() {
        System.out.println("Shape is drawn");
    }
}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle is drawn");
    }
}

public class Polymorphism_Overriding2 {
	 public static void main(String[] args) {
	        Shape obj = new Circle();
	        obj.draw();
	    }
}
