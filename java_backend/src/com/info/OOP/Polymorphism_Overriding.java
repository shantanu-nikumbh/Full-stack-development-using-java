package com.info.OOP;

class Animal_Class {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog_class extends Animal_Class {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}
public class Polymorphism_Overriding {
	public static void main(String[] args) {
		Dog_class obj = new Dog_class();
        obj.sound();
    }
}
