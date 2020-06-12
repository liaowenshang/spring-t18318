package com.edu.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.bean.Customer;
import com.edu.bean.Orders;
import com.edu.centroller.CentrollerCustomer;
import com.edu.service.PresonService;

public class CustomerControllerTest {
	 ApplicationContext context = 
			 new ClassPathXmlApplicationContext("applicationContext.xml");

	@Test
	public void Test() {
	    
           
	     CentrollerCustomer centrollerCustomer=(CentrollerCustomer)context.getBean("centrollerCustomer");
	     List<Customer> customers = centrollerCustomer.getAll();
	     customers.stream().forEach(System.out::println);
		
 
	}

}
