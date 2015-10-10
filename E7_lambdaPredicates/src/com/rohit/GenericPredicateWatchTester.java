package com.rohit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericPredicateWatchTester {

	public static void main(String[] args) {
		List<Watch> wList = Watch.generateWatchList();
		
		List<Watch> tList = genericFinder(wList, watch -> watch.getManufacturer().equals("Fossil"));
		genericDisplay(tList);
		
		List<Car> carList = Car.generateCarList();
		List<Car> tcList = genericFinder(carList, car -> car.getPrice() > 350000 && car.getHorsePoswer() > 1000);
		genericDisplay(tcList);

	}
	
	public static <T> void genericDisplay(List<T> list) {
		System.out.println("-------------------");
		for(T t : list) {
			System.out.println(t);
		}
	}
	
	public static <T> List<T> genericFinder(List<T> list, Predicate<T> predicate) {
		List<T> tList = new ArrayList<>();
		for(T t : list) {
			if(predicate.test(t)) {
				tList.add(t);
			}
		}
		
		return tList;
	}
}
