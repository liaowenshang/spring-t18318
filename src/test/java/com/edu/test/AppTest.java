package com.edu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.bean.Customer;
import com.edu.bean.Orders;

public class AppTest {
	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

	
	@Test
	public void Test2() {
		

		Customer orders = (Customer) context.getBean("customer");
		System.out.println(orders);

	}
	
	
	@Test
	public void Test() {
		

		Orders orders = (Orders) context.getBean("orders");
		System.out.println(orders);

	}

	/*
	 * @Test public void Test1() {
	 * 
	 * Orders orders = new Orders(); System.out.println(orders);
	 * 
	 * }
	 * 
	 * @Test public void Test2() { Orders orders = (Orders)
	 * context.getBean("ordersfactory"); System.out.println(orders);
	 * 
	 * }
	 * 
	 * 
	 * @Test public void Test3() { Orders orders = (Orders)
	 * context.getBean("orders2"); System.out.println(orders);
	 * 
	 * }
	 */

}
