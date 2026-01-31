package com.info.OOP;

class Vehicle {
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}

class SportsCar extends Car {
    void speed() {
        System.out.println("Sports car runs very fast");
    }
}

public class Multilevel_Inheritance3 {
	 public static void main(String[] args) {
	        SportsCar obj = new SportsCar();
	        obj.start();
	        obj.drive();
	        obj.speed();
	    }
}
