package com.demo;

import java.util.function.Supplier;

public class Demo03_ReferenceToConstructor {
	public static void main(String[] args) {
//		no input, get Object
		Supplier<UserGreeting> sup1 = ()->{return new UserGreeting();};
		Supplier<UserGreeting> sup2 = UserGreeting::new;
	}
}
