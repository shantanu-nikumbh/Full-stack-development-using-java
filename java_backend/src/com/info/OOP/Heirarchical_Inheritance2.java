package com.info.OOP;

class AnimalClass {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class DogClass extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

class CatClass extends Animal {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class Heirarchical_Inheritance2 {
	public static void main(String[] args) {
		DogClass d = new DogClass();
        d.eat();
        d.bark();

        CatClass c = new CatClass();
        c.eat();
        c.meow();
    }
}
