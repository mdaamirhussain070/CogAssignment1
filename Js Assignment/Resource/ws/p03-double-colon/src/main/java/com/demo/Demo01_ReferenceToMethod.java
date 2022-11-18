package com.demo;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Calculator{
	public int multiply(int a, int b) {
		return a*b;
	}
	public static void add(int a, int b) {
		System.out.println("Addition of "+a+" and "+b+" is "+(a+b));
	}
}

public class Demo01_ReferenceToMethod {

	public static void main(String[] args) {
		
		Calculator calc = new Calculator();
		
		// FI -> 2 input and 1 response
		BiFunction<Integer,Integer,Integer> myLambda = calc::multiply;
		
		BiConsumer<Integer, Integer> myLamnda2 = Calculator::add;
	}
	
}
