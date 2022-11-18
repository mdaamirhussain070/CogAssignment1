package com.demo;

import java.util.function.Consumer;

public class GreetingDemo2 {

	public static void greetUser(Consumer<String> g, String name) {
		g.accept(name);
	}
	
	public static void main(String[] args) {
		
		Consumer<String> g = (name)-> {
				System.out.println("Printing name, "+name);
		};
		String name = "arun";
		greetUser(g, name);
	}
}
