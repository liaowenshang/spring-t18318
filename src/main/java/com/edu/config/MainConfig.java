package com.edu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.edu.bean.Customer;
import com.edu.bean.Orders;
import com.edu.bean.Person;

@Configuration
@ComponentScan(basePackages="com.edu")
public class MainConfig {
	
	@Bean(name="person")
	
	public Person person() {
		return new Person();
		
	}
	
    @Bean(name="orders")	
	public Orders orders() {
		return new Orders();
		
	}
    
    @Bean(name="customer")	
   	public Customer customer() {
   		return new Customer();
   		
   	}
	
	
	
}
