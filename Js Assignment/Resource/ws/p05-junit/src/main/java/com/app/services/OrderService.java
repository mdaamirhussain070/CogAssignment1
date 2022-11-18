package com.app.services;

import java.sql.SQLException;

import com.app.dao.OrderDao;
import com.app.exceptions.OrderException;
import com.app.models.Order;

public class OrderService {
	
	private OrderDao dao;
	
//	public OrderService(OrderDao dao) {
//		this.dao = dao;
//	}

	public boolean placeOrder(Order order) throws OrderException {
		System.out.println("Order: "+order);
		// validation for order
		if(order.getPrice() < 0) {
			throw new OrderException("Order price can not be zero or less");
		}
		
		try {
			order.setId(0);
			System.out.println("dao"+dao);
			Order savedOrder = this.dao.saveOrder(order);
			if(savedOrder.getId() > 0) {
				return true;
			} else {
				return false;
			}
		} catch(SQLException e) {
			throw new OrderException("Database is not working", e);
		} catch(NullPointerException e) {
			throw new OrderException("Database is returning null", e);
		}
	}
	
}
