

package com.revature.springbootP4.model;



import java.time.LocalDateTime;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
@Entity
@Table(name = "orders")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderId;
	private Integer total;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDateTime createdAt;
	@ManyToOne(fetch = FetchType.EAGER)
	private Customer customer;
	
	public Order(Integer orderId, Integer total, Integer id) {
		super();
		this.orderId = orderId;
		this.total = total;
		this.customer = new Customer(id, "", "", "", "", "", "", "", "", "");
	}

	}
	
	
