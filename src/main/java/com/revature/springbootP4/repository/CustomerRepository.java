package com.revature.springbootP4.repository;



import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.springbootP4.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer>{

}
