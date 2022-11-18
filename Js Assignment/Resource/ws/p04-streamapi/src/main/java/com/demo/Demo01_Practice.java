package com.demo;

import java.util.ArrayList;
import java.util.List;

public class Demo01_Practice {

	public static void main(String[] args) {
		List<String> names = List.of("Spiderman",
				"Superman",
				"Hulk",
				"Antman",
				"Ironman",
				"shaktiman",
				"Hanuman");
		
		List<String> endingWithMan = new ArrayList<>();
		names.forEach(name->{
			if(name.endsWith("man")) {
				endingWithMan.add(name);
			}
		});
		
		List<String> firstCharS = new ArrayList<>();
		endingWithMan.forEach(name->{
			if(name.startsWith("s")||name.startsWith("S")) {
				firstCharS.add(name);
			}
		});
		
		List<String> capitalNames = new ArrayList<>();
		firstCharS.forEach(name->{
			capitalNames.add(name.toUpperCase());
		});
		
		System.out.println(capitalNames);
		
	}
	
}
