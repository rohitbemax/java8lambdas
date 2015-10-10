package com.rohit;

import java.util.Date;

public class MethodReference {

	public static void main(String[] args) {
		
		//Anonymous Inner class
		MyTestInterface iface = new MyTestInterface() {

			@Override
			public void testInterface() {
				System.out.println("My test interface");
				//MyTestClass.myTestMethod();
			}
		};
		
		iface.testInterface();
		
		//Lambda expression
		MyTestInterface fInt = () -> MyTestClass.myTestMethod();
		fInt.testInterface();
		
		//Method refrence
		MyTestInterface t2 = MyTestClass::myTestMethod;
		t2.testInterface();
		
		/* Example 2 start */
		MyTestInterface2 iface2 = (n, i) -> MyTestClass2.myTestMethod(n, i);
		iface2.simpleTestFunction("rohit", 13);
		
		MyTestInterface2 iface3 = MyTestClass2::myTestMethod;
		iface3.simpleTestFunction("Cacha chaudhry", 30);
		
		/* Example 2 end */
		
		/* Example 3 start */
		iTakeFIAsArgument((n, a) -> MyTestClass2.myTestMethod(n, a));
		iTakeFIAsArgument(MyTestClass2::myTestMethod);
		
		/* Example 3 end */
		
		/* Example 4 start */
		Fruit f = new Fruit("Mango");
		weirdFunction(f, (name) -> System.out.println(name));
		weirdFunction(f, System.out::println);
		/* Example 4 end */
		
		/* Example 5 start */
		emptyFIFunction(() -> new Date());
		emptyFIFunction(Date::new);
		
		//emptyFIFunction(() -> new MyTestClass2());
		//emptyFIFunction(MyTestClass2::new);
		/* Example 5 end */
		
		//Q: Create a functional interface takes character array and prints using String class
	}
	
	public static void iTakeFIAsArgument(MyTestInterface2 iface) {
		iface.simpleTestFunction("Piyush", 27);
	}
	
	public static void weirdFunction(Fruit f, MyWeirdFunctionInterface iface) {
		iface.myWeirdMethod(f.getName());
	}
	
	public static void emptyFIFunction(MyEmptyMethodInterface<Date> efi) {
	//public static void emptyFIFunction(MyEmptyMethodInterface<MyTestClass2> efi) {
		System.out.println("Value -- " + efi.emptyArgMethod());
	}
}