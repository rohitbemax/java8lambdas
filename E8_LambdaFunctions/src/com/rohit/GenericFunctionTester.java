package com.rohit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

import com.rohit.*;

public class GenericFunctionTester {
	
	public static void main(String args[]) {
		List<Watch> wList = Watch.generateWatchList();
		
		Function<Watch, Watch> wFxn = watch -> {
			watch.brand = watch.getBrand().toUpperCase();
			watch.price = watch.getPrice() + 99;
			return watch;
		};
		
		//Q: Write similar function for Car and a generic display method
		//Do the same using Stream "MAP" class
	}
	
	public static <T, R> List<R> genericConverter(List<T> list, Function<T, R> fxn) {
		List<R> myList = new ArrayList<>();
		for(T t : list) {
			myList.add(fxn.apply(t));
		}
		
		return myList;
	}
}
