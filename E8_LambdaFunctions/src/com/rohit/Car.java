package com.rohit;

import java.util.ArrayList;
import java.util.List;

public class Car {
	String name;
	int price;
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String getName() { return name; }
	public int getPrice() { return price; }
	
	//Utility function to generate Car list
	public static List<Car> generateCarList() {
		List<Car> carList = new ArrayList<>();
		carList.add(new Car("Alto", 200000));
		carList.add(new Car("I10", 450000));
		carList.add(new Car("Santro", 300000));
		
		return carList;
	}
}
