package com.rohit;

public class Employee {
	
	int salary;
	
	public Employee(int salary) {
		this.salary = salary;
	}
	
	Integer calcBonus(Bonus b, Integer incentive) {
		return b.getBonus() + salary + incentive;
	}
}
