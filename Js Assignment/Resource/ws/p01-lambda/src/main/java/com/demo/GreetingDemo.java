package com.demo;


// single abstract method = SAM
@FunctionalInterface
interface Greeting{
	public void greet(String name);
//	public String print(String text);
	public String toString();
}

class GreetingImpl implements Greeting{
	@Override
	public void greet(String name) {
		System.out.println("Saving name in database, name: "+name);
	}
}

public class GreetingDemo {

	public static void greetUser(Greeting g, String name) {
		g.greet(name);
	}
	
	public static void main(String[] args) {
//		Greeting g = new GreetingImpl();
//		Greeting g = new Greeting() {
//			
//			@Override
//			public void greet(String name) {
//				System.out.println("Save name in file, name: "+name);
//			}
//		};
		
		Greeting g = (name)-> {
				System.out.println("Printing name, "+name);
		};
		String name = "arun";
		greetUser(g, name);
	}
}
