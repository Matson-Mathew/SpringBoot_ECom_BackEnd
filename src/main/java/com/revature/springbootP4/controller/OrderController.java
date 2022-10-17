
package com.revature.springbootP4.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.revature.springbootP4.model.Customer;
import com.revature.springbootP4.model.Order;
import com.revature.springbootP4.service.OrderService;

@RestController
public class OrderController {

	private OrderService orderService;

	@Autowired
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}

	// to get all orders of a customer
	@RequestMapping("/customers/{id}/orders")
	public List<Order> getAllOrdersByCustomer(@PathVariable Integer id) {
		return orderService.getAllOrders(id);
	}

	
	@RequestMapping("/customers/{id}/orders/{orderId}")
	public Optional<Order> getOrderByOrderId(@PathVariable Integer orderId) {
		return orderService.getOrder(orderId);
	}
	
	
	@PostMapping("/customers/{id}/orders")
	public void addOrder(@RequestBody Order order, @PathVariable Integer id) {
		order.setCustomer(new Customer(id, "", "", "", "", "", "", "", "", ""));
		orderService.addOrder(order);
	}
	

	@PutMapping("/customers/{id}/orders/{orderId}")
	public void updateOrder(@RequestBody Order order, @PathVariable Integer id, @PathVariable Integer orderId ) {
		order.setCustomer(new Customer(id, "", "", "", "", "", "", "", "", ""));
		orderService.updateOrder(order);
	}

	@DeleteMapping("/customers/{id}/orders/{orderId}")
	public void deleteOrder(@PathVariable Integer orderId) {
		orderService.deleteOrder(orderId);
	}

}
