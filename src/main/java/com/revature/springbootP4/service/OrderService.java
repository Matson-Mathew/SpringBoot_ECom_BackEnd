
package com.revature.springbootP4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springbootP4.model.Order;
import com.revature.springbootP4.repository.OrderRepository;

@Service
public class OrderService {
	private OrderRepository orderRepository;

	
	@Autowired
	public OrderService(OrderRepository orderRepository) {
		super();
		this.orderRepository = orderRepository;
	}

	public List<Order> getAllOrders(Integer id) {
		List<Order> orders = new ArrayList<>();
		orderRepository.findByCustomerId(id)
		.forEach(orders::add);
		return orders;
	}

	public Optional<Order> getOrder(Integer orderId) {
		return orderRepository.findById(orderId);
	}
	
	public void addOrder(Order order) {
		orderRepository.save(order);
	}
	
	public Order updateOrder(Order order) {
		Order c= orderRepository.save(order);
		return c;
	}

	public Optional<Order> getOderById(Integer id) {
		
		return orderRepository.findById(id);
	}

	public void deleteOrder(Integer id) {
		orderRepository.deleteById(id);
	}

	

}

