package com.rohit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class FunctionTesterMain {

	public static void main(String[] args) {
		List<Watch> wList = Watch.generateWatchList();
		
		wList.forEach(watch -> System.out.println(watch.getBrand()));
		//convertToLowerCase(wList);
		//wList.forEach(watch -> System.out.println(watch.getBrand()));
		//convertToUpperCase(wList);
		//wList.forEach(watch -> System.out.println(watch.getBrand()));
		
		Function<Watch, Watch> fxnWatch = watch -> {
			watch.brand = watch.getBrand().toLowerCase();
			return watch;
		};
		
		Function<Watch, Watch> fxnWatch2 = watch -> {
			watch.brand = watch.getBrand().toUpperCase();
			return watch;
		};
		
		List<Watch> tList = genericConvert(wList, fxnWatch);
		tList.forEach(watch -> System.out.println(watch.getBrand()));
		
		tList = genericConvert(wList, fxnWatch2);
		tList.forEach(watch -> System.out.println(watch.getBrand()));
		
	}
	
	public static void convertToUpperCase(List<Watch> wList) {
		for(Watch w : wList) {
			w.brand = w.getBrand().toUpperCase();
		}
	}
	
	public static void convertToLowerCase(List<Watch> wList) {
		for(Watch w: wList) {
			w.brand = w.getBrand().toLowerCase();
		}
	}
	
	public static List<Watch> genericConvert(List<Watch> wList, Function<Watch, Watch> fxn) {
		List<Watch> tList = new ArrayList<>();
		
		for(Watch w : wList) {
			tList.add(fxn.apply(w));
		}
		
		return tList;
	}
}
