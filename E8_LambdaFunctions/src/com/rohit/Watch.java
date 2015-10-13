package com.rohit;

import java.util.ArrayList;
import java.util.List;

public class Watch {
	String model;
	int price;
	String brand;
	
	public Watch(String name, int price, String brand) {
		this.model = name;
		this.price = price;
		this.brand = brand;
	}
	
	public String getModel() { return model; }
	public int getPrice() { return price; }
	public String getBrand() { return brand; }
	
	//Utility method to create a few watches
	public static List<Watch> generateWatchList() {
		List<Watch> list = new ArrayList<>();
		list.add(new Watch("Coachman", 10000, "Fossil"));
		list.add(new Watch("Raga", 5000, "Titan"));
		list.add(new Watch("ProWatch", 3000, "Fastrack"));
		list.add(new Watch("EcoDrive", 20000, "Citizen"));
		list.add(new Watch("Chrono", 1000, "Fossil"));
		list.add(new Watch("Ceramic", 3000, "Fossil"));
				
		return list;
	}
}
