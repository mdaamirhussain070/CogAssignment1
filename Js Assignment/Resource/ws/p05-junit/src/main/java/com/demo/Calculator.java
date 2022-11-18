package com.demo;

public class Calculator {

	public int add(int ...arr) {
		int sum = 0;
		for(int n:arr) {
			sum += n;
		}
		return sum;
	}
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) throws MyException {
//		if(b==0) {
//			throw new MyException("can not devide by zero");
//		}
		try {			
			return a/b;
		} catch(ArithmeticException e) {
			throw new MyException("can not devide by zero", e);
		}
		
	}
	
}
