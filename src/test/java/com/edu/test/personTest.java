package com.edu.test;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.bean.Customer;
import com.edu.bean.Orders;
import com.edu.bean.Person;
import com.edu.centroller.CentrollerCustomer;
import com.edu.config.MainConfig;
import com.edu.service.PresonService;

public class personTest {
	AnnotationConfigApplicationContext context= new AnnotationConfigApplicationContext(MainConfig.class);

	@Test
	public void Test() {
		/*
		 * Person person = (Person) context.getBean("person");
		 * System.out.println(person);
		 */
		
		String[] names=context.getBeanDefinitionNames();
		for (String name:names) {
			System.out.println(name);						
		}
		
		
		System.out.println("=====================");
		CentrollerCustomer centrollerCustomer=(CentrollerCustomer)context.getBean("centrollerCustomer");
	     List<Customer> customers = centrollerCustomer.getAll();
	     customers.stream().forEach(System.out::println);

	}

}
