package com.revature.springbootP4.model;



import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String first_name;
	private String last_name;
	private String phone_no;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String state;
	private String email;
	private String password;
	
//	@OneToMany
//	private List<Order> order;
	 
	
	public Customer(String first_name, String last_name, String phone_no, String addressLine1, String addressLine2,
			String city, String state, String email, String password) {
		super();
		this.first_name = first_name;
		this.last_name = last_name;
		this.phone_no = phone_no;
		this.addressLine1 = addressLine1;
		this.addressLine2 = addressLine2;
		this.city = city;
		this.state = state;
		this.email = email;
		this.password= password;
	
	}
}
