package com.demo;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

public class Demo05_Date {

	public static void main(String[] args) {
		LocalDate fid = LocalDate.of(1947, Month.AUGUST, 15);
		
		System.out.println(fid);

		LocalDateTime today = LocalDateTime.now();
		
		System.out.println(today);
	}
	
}
