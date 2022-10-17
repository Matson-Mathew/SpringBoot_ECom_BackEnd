
package com.revature.springbootP4.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.revature.springbootP4.model.Order;

public interface OrderRepository extends JpaRepository<Order, Integer>{

	public List<Order> findByCustomerId(Integer id);
}

