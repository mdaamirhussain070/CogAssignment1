package com.java.assignment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
	
	private int id;
	private String status;
	
	private LocalDate orderDate;
	private LocalDate deliveryDate;
	private List<Item> items=new ArrayList<>();
	private Customer cus;

	
	public Order(int id, String status, LocalDate orderDate, LocalDate deliveryDate, List<Item> items, Customer cus) {
		super();
		this.id = id;
		this.status = status;
		this.orderDate = orderDate;
		this.deliveryDate = deliveryDate;
		this.items = items;
		this.cus = cus;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public LocalDate getDeliveryDate() {
		return deliveryDate;
	}
	public void setDeliveryDate(LocalDate deliveryDate) {
		this.deliveryDate = deliveryDate;
	}
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Customer getCus() {
		return cus;
	}
	public void setCus(Customer cus) {
		this.cus = cus;
	}
	
	
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public static List<Order> getOrderList(){
		LocalDate d1= LocalDate.parse("2021-11-14");
		Item i1=new Item(134,"Moto24",15000,"Mobiles");
		Item i2=new Item(157,"Spiderman",50,"Books");
		Item i3=new Item(204,"Acer",70000,"Laptops");
		Item i4=new Item(210,"iPhone",45000,"Mobiles");
		Item i5=new Item(215,"Shirt",15000,"Shirts");
		
		Customer c1=new Customer(1,"Tom","male","Bengalore");
		Customer c2=new Customer(2,"Mike","male","Delhi");
		Customer c3=new Customer(3,"Miley","femal","Pune");
		Customer c4=new Customer(4,"Kunal","male","Delhi");
		Customer c5=new Customer(5,"Sakshi","male","Delhi");
		

		
		Order o1=new Order(1,"delivered",LocalDate.parse("2021-11-12"),LocalDate.parse("2021-11-14"),Arrays.asList(i1,i3),c1);
		Order o2=new Order(2,"delivered",LocalDate.parse("2022-05-19"),LocalDate.parse("2022-05-24"),Arrays.asList(i3),c4);
		
		Order o3=new Order(3,"delivered",LocalDate.parse("2021-06-30"),LocalDate.parse("2021-08-04"),Arrays.asList(i4,i5),c2);
		Order o4=new Order(4,"pending",LocalDate.parse("2022-10-29"),LocalDate.parse("2022-11-29"),Arrays.asList(i1,i2,i3,i5),c3);
		
		Order o5=new Order(5,"pending",LocalDate.parse("2021-10-30"),LocalDate.parse("2021-11-12"),Arrays.asList(i1),c5);
	
		return Arrays.asList(o1,o2,o3,o4,o5);
	}
	
	@Override
	public String toString() {
		return "Order [id=" + id + ", status=" + status + ", deliveryDate=" + deliveryDate + ", items=" + items
				+ ", cus=" + cus + "]";
	}
	
	
	

}
