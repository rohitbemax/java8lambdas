package com.rohit;

import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleUnaryOperator;
import java.util.function.IntPredicate;
import java.util.function.LongUnaryOperator;
import java.util.function.Supplier;
import java.util.function.ToDoubleBiFunction;

public class SimplyTypedFI {
	
	public static void main(String args[]) {
		IntPredicate ip = var -> var > 11;
		System.out.println("IntPredicate: " + ip.test(9));
		
		LongUnaryOperator lup = var -> var + 11;
		System.out.println("LongUnaryOperator: " + lup.applyAsLong(11L));
		
		DoubleUnaryOperator duo = (x) -> (x + 22);
		System.out.println("DoubleUnaryOperator: " + duo.applyAsDouble(20));
		
		ToDoubleBiFunction<Integer,Long> i  = (x,y)-> Math.sin(x)+Math.sin(y);
	    System.out.println("ToDoubleBiFunction: " + i.applyAsDouble(Integer.MAX_VALUE, Long.MAX_VALUE));
	    
	    DoubleBinaryOperator d = (x,y) -> x*y;
	    System.out.println("DoubleBinaryOperator: " + d.applyAsDouble(0.11, 0.49));
	}
}
