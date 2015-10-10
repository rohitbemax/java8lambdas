package com.rohit;

public class MyGenericInterfacetester {

	
	public static void main(String[] args) {
		GenericFunctionalInterface<MyGenericInterfacetester, Integer, Integer, Integer> gfi =
				(a, b, c) -> a.instanceMethodAdd(b, c);
		System.out.println("Sum " + gfi.perform(new MyGenericInterfacetester(), 20, 30));
		
		GenericFunctionalInterface<Employee, Bonus, Integer, Integer> gfi2 = 
				(a, b, c) -> a.calcBonus(b, c);
		System.out.println("Total salary: " + gfi2.perform(new Employee(100), new Bonus(100), 10));
		
		//checkMyInstance(MyGenericInterfacetester::instanceMethodAdd);
	}

	Integer instanceMethodAdd(Integer a, Integer b) {
		System.out.println("Sum -- " + (a + b));
		return a + b;
	}
	
	static void checkMyInstance(GenericFunctionalInterface<MyGenericInterfacetester, Integer, Integer, Integer> gfi) {
		gfi.perform(new MyGenericInterfacetester(), 10, 20);
	}
}
