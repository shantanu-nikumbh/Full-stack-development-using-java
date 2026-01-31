package com.info.OOP;

class Employee{
	private int id;
    private String name;
    private double salary;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
    
    
}
public class Encapsulation2 {
	public static void main(String args[]) {
		 Employee e = new Employee();

	        e.setId(1);
	        e.setName("Amit");
	        e.setSalary(25000);

	        System.out.println("ID: " + e.getId());
	        System.out.println("Name: " + e.getName());
	        System.out.println("Salary: " + e.getSalary());
	}
}
