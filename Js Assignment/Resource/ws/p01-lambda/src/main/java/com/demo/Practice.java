package com.demo;

import java.util.List;
import java.util.function.Consumer;

public class Practice {

	
	
	public static void main(String[] args) {
		List<String> names = List.of("Spiderman",
				"Superman",
				"Hulk",
				"Antman",
				"Ironman",
				"Shaktiman",
				"Hanuman");
		
		System.out.println(names);
		
		
		//	find all names ending with "man" and print
		Consumer<List<String>> consumer = (nameList)-> {
			nameList.forEach((n)->{
				if(n.endsWith("man"))
				System.out.println(n+" is dancing");
			});
		};
		doTask(consumer, names);
		
		
//		find all names starting with "s" or "S" and print
	}
	
	private static void doTask(Consumer<List<String>> c, List<String> list) {
		c.accept(list);
	}
}
