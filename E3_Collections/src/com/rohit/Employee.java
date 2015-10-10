package com.rohit;

public class Employee {

	String name;
	int salary;
	int age;
	
	public Employee(String name, int salary, int age) {
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
	public String getName() { return name; }
	public int getSalary() { return salary; }
	public int getAge() { return age; }
}
