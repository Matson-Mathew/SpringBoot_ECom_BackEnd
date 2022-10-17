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
import com.revature.springbootP4.service.CustomerService;

@RestController
public class CustomerController {

	private CustomerService customerService;

	@Autowired
	public CustomerController(CustomerService customerService) {
		super();
		this.customerService = customerService;
	}

	@RequestMapping("/customers")
	public List<Customer> getAllCustomers() {
		return customerService.getAllCustomers();
	}

	@RequestMapping("/customers/{id}")
	public Optional<Customer> getCustomerById(@PathVariable Integer id) {
		return customerService.getCustomerById(id);

	}

	@PostMapping("/customers")
	public Customer addCustomer(@RequestBody Customer customer) {
		return customerService.addCustomer(customer);

	}

	@PutMapping("/customers/{id}")
	public void updateCustomer(@PathVariable Integer id, @RequestBody Customer customer) {
		customerService.updateCustomer(customer);
	}

	@DeleteMapping("/customers/{id}")
	public void deleteCustomer(@PathVariable Integer id) {
		customerService.deleteCustomer(id);
	}

}
