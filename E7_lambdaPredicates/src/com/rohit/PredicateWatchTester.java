package com.rohit;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWatchTester {

	public static void main(String[] args) {
		List<Watch> wList = Watch.generateWatchList();
		
		List<Watch> tList = findWatchesByManuf(wList, "Fossil");
		System.out.println("Watch by manufacturer");
		for(Watch w : tList) {
			System.out.println("Watch : " + w.getName());
		}
		
		tList = findWatchesByManufAndPrice(wList, "Fossil", 4000);
		System.out.println("Watch by manufacturer");
		for(Watch w : tList) {
			System.out.println("Watch : " + w.getName());
		}
		
		System.out.println("--------------------------------------");
		//tList = findWatch(wList, watch -> watch.getManufacturer().equals("Fossil"));
		tList = findWatch(wList, watch -> watch.getManufacturer().equals("Fossil"));
		System.out.println("Watch by manufacturer2");
		for(Watch w : tList) {
			System.out.println("Watch : " + w.getName());
		}
		
	}
	
	public static List<Watch> findWatchesByManuf(List<Watch> list, String manuf) {
		List<Watch> tList = new ArrayList<>();
		for(Watch w : list) {
			if(w.getManufacturer().equals(manuf)) {
				tList.add(w);
			}
		}
		
		return tList;
	}
	
	public static List<Watch> findWatchesByPrice(List<Watch> list, int price) {
		List<Watch> tList = new ArrayList<>();
		for(Watch w : list) {
			if(w.getPrice() > price) {
				tList.add(w);
			}
		}
		
		return tList;
	}
	
	public static List<Watch> findWatchesByManufAndPrice(List<Watch> list, String manuf, int price) {
		List<Watch> tList = new ArrayList<>();
		for(Watch w : list) {
			if(w.getManufacturer().equals(manuf) && w.getPrice() > price) {
				tList.add(w);
			}
		}
		
		return tList;
	}
	
	public static List<Watch> findWatch(List<Watch> wList, Predicate<Watch> predicate) {
		List<Watch> tList = new ArrayList<>();
		for(Watch w : wList) {
			if(predicate.test(w)) {
				tList.add(w);
			}
		}
		
		return tList;
	}
}
