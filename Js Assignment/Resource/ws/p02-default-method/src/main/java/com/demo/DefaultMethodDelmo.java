package com.demo;

interface A{
	public default void doTask() {
		System.out.println("In A");
	}
	
	public static void method2() {
		System.out.println("This is static method in interface");
	}
}
interface B{
	public default void doTask() {
		System.out.println("In B");
	}
}

public class DefaultMethodDelmo implements A,B{

	public void doTask() {
		System.out.println("In class method");
	}
	
	public static void main(String[] args) {
		DefaultMethodDelmo demo = new DefaultMethodDelmo();
		
		demo.doTask();
		A.method2();
	}
	
}
