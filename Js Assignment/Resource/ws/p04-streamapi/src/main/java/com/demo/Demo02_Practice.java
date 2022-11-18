package com.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Demo02_Practice {

	public static void main(String[] args) {
		List<String> names = List.of("Spiderman",
				"Superman",
				"Hulk",
				"Antman",
				"Ironman",
				"shaktiman",
				"Hanuman");
		
		List<String> list = names.stream()
				.filter((n)->n.endsWith("man"))
				.filter((n)->n.startsWith("s") || n.startsWith("S"))
				.map(n->n.toUpperCase())
				.collect(Collectors.toList());
				
		System.out.println(list);
	}
	
}
