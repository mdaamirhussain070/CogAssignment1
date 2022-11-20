package com.java.assignment;

import java.util.Arrays;
import java.util.List;

public class Customer {
	
	private int id;
	private String name;
	private String gender;
	private String city;
	
	public Customer(int id, String name, String gender, String city) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.city = city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	public List<Customer> getCustomerList(){
		Customer c1=new Customer(1,"Tom","male","Bengalore");
		Customer c2=new Customer(2,"Mike","male","Delhi");
		Customer c3=new Customer(3,"Miley","femal","Pune");
		Customer c4=new Customer(4,"Kunal","male","Delhi");
		Customer c5=new Customer(5,"Sakshi","male","Delhi");
		
		List<Customer> customerList=Arrays.asList(c1,c2,c3,c4,c5);
		return customerList;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", gender=" + gender + ", city=" + city + "]";
	}
	
	
	

}
