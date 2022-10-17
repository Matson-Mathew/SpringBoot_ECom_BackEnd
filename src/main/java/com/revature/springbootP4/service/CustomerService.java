package com.revature.springbootP4.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.springbootP4.model.Customer;
import com.revature.springbootP4.repository.CustomerRepository;

@Service
public class CustomerService {
	private CustomerRepository customerRepository;

	@Autowired
	public CustomerService(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}

	public List<Customer> getAllCustomers() {
		List<Customer> customers = new ArrayList<>();
		customerRepository.findAll().forEach(customers::add);
		return customers;
	}

	public Customer addCustomer(Customer customer) {
		Customer c = customerRepository.save(customer);
		return c;
	}

	public Customer updateCustomer(Customer customer) {
		Customer c = customerRepository.save(customer);
		return c;
	}

	public Optional<Customer> getCustomerById(Integer id) {
		return customerRepository.findById(id);
	}

	public void deleteCustomer(Integer id) {
		customerRepository.deleteById(id);
	}

}
