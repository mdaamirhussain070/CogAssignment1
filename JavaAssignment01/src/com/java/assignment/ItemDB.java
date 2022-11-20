package com.java.assignment;

import java.util.Arrays;
import java.util.List;

public class ItemDB {
	public static List<Item> getAllItem(){
		Item item1=new Item(134,"MOto24",15000,"Mobiles");
		Item item2=new Item(157,"Spiderman",50,"Books");
		Item item3=new Item(204,"Acer",70000,"Laptops");
		Item item4=new Item(210,"iPhone",45000,"Mobiles");
		Item item5=new Item(215,"Shirt",15000,"Shirts");
		
		List<Item> itemList=Arrays.asList(item1,item2,item3,item4,item5);
		return itemList;
	}

}
