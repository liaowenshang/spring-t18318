package com.edu.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.bean.Customer;
import com.edu.dao.CentrolleDao;

@Repository(value="centrolleDao")
public class CentrollerDaoImpl implements CentrolleDao {
	
	
	@Override
	public List<Customer> getAllCustomer() {
		List<Customer> customers = new ArrayList<Customer>();
		Customer customer = new Customer();
		customer.setId(1);
		customer.setUserName("张三");
		
		Customer customer2 = new Customer();
		customer2.setId(2);
		customer2.setUserName("李四");
		
		customers.add(customer);
		customers.add(customer2);
		
		
		return customers;
	}
	
	
	

}
