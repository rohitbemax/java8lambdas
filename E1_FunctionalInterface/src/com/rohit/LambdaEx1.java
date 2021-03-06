package com.rohit;

/*
@FunctionalInterface
interface Calculator {
	int operation(int x, int y);
}
*/

public class LambdaEx1 {

	public static void main(String args[]) {
		
		Calculator cAdd = (x, y) -> x + y;
		Calculator cMul = (x, y) -> x * y;
		
		System.out.println("Add: " + cAdd.performArithmetic(10,  20));
		System.out.println("Mul: " + cMul.performArithmetic(10, 20));
		
		Converter c1 = (x) -> x.toUpperCase();
		Converter c2 = x -> x.toLowerCase();
		
		//printMessage(c1, c2, "Rohit");
		
		//printMessage2(x -> x.toUpperCase(), x -> x.toLowerCase(), "Rahul");
		
		//Q: Create a new method to replace a string with space to !
	}
	
	public static void printMessage(Converter c1, Converter c2, String s) {
		System.out.println(c1.convertMessage(s));
		System.out.println(c2.convertMessage(s));
	}
	
	public static void printMessage2(Converter c1, Converter c2, String s) {
		System.out.println(c1.convertMessage(s));
		System.out.println(c2.convertMessage(s));
	}
	
	public static void printMessage(Converter c, String s) {
		System.out.println(c.convertMessage(s));
	}
}
