package com.edu.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

import com.edu.aop.CalCulatorAOP3;
import com.edu.bean.Customer;
import com.edu.bean.Orders;
import com.edu.bean.Person;
import com.edu.service.CalculatorService3;

@Configuration
@EnableAspectJAutoProxy
public class MainConfig2 {
	@Bean
	public CalculatorService3 calculatorService3() {
		return new CalculatorService3();
	}
	@Bean
	public CalCulatorAOP3 calCulatorAOP3() {
		return new CalCulatorAOP3();
	}
	
	
	
	
	
	
	
}
