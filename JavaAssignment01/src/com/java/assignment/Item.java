package com.java.assignment;

import java.util.Arrays;
import java.util.List;

public class Item {
	
	private int id;
	private String name;
	private double price;
	private String category;
	
	
	
	public Item(int id,String name, double price, String category) {
		super();
		this.id = id;
		this.name=name;
		this.price = price;
		this.category = category;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}



	public double getPrice() {
		return price;
	}



	public void setPrice(double price) {
		this.price = price;
	}



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}
	
	public static List<Item> getAllItem(){
		Item item1=new Item(134,"MOto24",15000,"Mobiles");
		Item item2=new Item(157,"Spiderman",50,"Books");
		Item item3=new Item(204,"Acer",70000,"Laptops");
		Item item4=new Item(210,"iPhone",45000,"Mobiles");
		Item item5=new Item(215,"Shirt",15000,"Shirts");
		
		List<Item> itemList=Arrays.asList(item1,item2,item3,item4,item5);
		return itemList;
	}
	
	

	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + ", category=" + category + "]";
	}



	
	
	
	

}
