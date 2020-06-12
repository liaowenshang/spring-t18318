package com.edu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.bean.Customer;
import com.edu.bean.Orders;
import com.edu.service.PresonService;

public class AppTest2 {

	@Test
	public void Test() {
	     AbstractApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//		Customer c1 = (Customer) context.getBean("customer");
//		Customer c2 = (Customer) context.getBean("customer");
//		Orders o1 = (Orders) context.getBean("orders");
//		Orders o2 = (Orders) context.getBean("orders");
	     
		
//		System.out.println(o1 == o2);
//		System.out.println(c1 == c2);
	     
	     
	     PresonService p1 = (PresonService) context.getBean("presonService");
	     
	     p1.say();
	     
	     context.close();
		
		

	}

}
