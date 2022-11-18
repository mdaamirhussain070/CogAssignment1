package com.demo;

interface NoInputOneRes{
	UserGreeting getUserGreeting();
}
interface Greeting{
	UserGreeting getGreeting(String name);
}

class UserGreeting{
	public UserGreeting() {
		System.out.println("Welcome user");
	}
	public UserGreeting(String user) {
		System.out.println("Welcome "+user);
	}
}

public class Demo02_ReferenceToConstructor {
	public static void main(String[] args) {
		Greeting g = UserGreeting::new;
		
		UserGreeting ug = g.getGreeting("java");
		System.out.println(ug);
		
		NoInputOneRes lambda = UserGreeting::new;
		lambda.getUserGreeting();
	}
}
