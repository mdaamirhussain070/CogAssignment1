//package com.test;
//
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//
//import com.app.dao.OrderDao;
//import com.app.exceptions.OrderException;
//import com.app.models.Order;
//import com.app.services.OrderService;
//
//public class Demo2_OrderService {
//
//	@Mock
//	private OrderDao orderDao;
//	@InjectMocks
//	private OrderService service;
//
//	
//	@Test
//	public void shouldPlaceOrder() throws OrderException {
//		System.out.println(service);
//		Order order = new Order();
//		boolean isPlaced = service.placeOrder(order);
//		System.out.println(isPlaced);
//	}
//	
//}
