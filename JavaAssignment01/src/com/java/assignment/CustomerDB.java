package com.java.assignment;

import java.util.Arrays;
import java.util.List;

public class CustomerDB {
	public List<Customer> getCustomerList(){
		Customer c1=new Customer(1,"Tom","male","Bengalore");
		Customer c2=new Customer(2,"Mike","male","Delhi");
		Customer c3=new Customer(3,"Miley","femal","Pune");
		Customer c4=new Customer(4,"Kunal","male","Delhi");
		Customer c5=new Customer(5,"Sakshi","male","Delhi");
		
		List<Customer> customerList=Arrays.asList(c1,c2,c3,c4,c5);
		return customerList;
	}


}
