package com.rohit;

public class MyTestClass2 {
	public static void myTestMethod(String n, int a) {
		System.out.println("Name: " + n + ", Age: " + a);
	}
	
	public static void myTestMethod(int age) {
		System.out.println("Age: " + age);
	}
	
	public MyTestClass2() {
		System.out.println("This is my test class 2");
	}
}
