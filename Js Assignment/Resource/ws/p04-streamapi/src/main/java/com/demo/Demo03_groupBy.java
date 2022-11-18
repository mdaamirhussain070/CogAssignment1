package com.demo;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Employee{
	private String name;
	private double salary;
	private String dept;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public Employee(String name, double salary, String dept) {
		super();
		this.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", dept=" + dept + "]";
	}
	
}

public class Demo03_groupBy {

	public static void main(String[] args) {
		List<Employee> list = List.of(
				new Employee("Tom", 120000, "Medical"),
				new Employee("Mike", 150000, "Security"),
				new Employee("Carl", 140000, "Medical"),
				new Employee("Clark", 125000, "Security"),
				new Employee("Thomus", 135000, "Security")
		);
		
		System.out.println(list);
		
		TreeMap<String, List<Employee>> collect = list.stream().collect(
						  Collectors.groupingBy(
								  Employee::getDept, 
								  TreeMap::new,
								  Collectors.toList()));
		
		System.out.println(collect);

//		list.stream().collect(Collectors.groupingBy(emp->emp::getDept));
		
		
//		fromGoogle();
		
	}
	
	
	private static void fromGoogle(){
		List<String> strings = List.of("a", "bb", "cc", "ddd");

		TreeMap<Integer, List<String>> result = strings.stream()
		  .collect(Collectors.groupingBy(String::length, TreeMap::new, Collectors.toList()));

		System.out.println(result); // {1=[a], 2=[bb, cc], 3=[ddd]}
	}
	
}
