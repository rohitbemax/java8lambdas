package com.rohit;

@FunctionalInterface
public interface GenericFunctionalInterface<T1, A1, A2, R> {
	R perform(T1 invoker, A1 arg1, A2 arg2);
}
