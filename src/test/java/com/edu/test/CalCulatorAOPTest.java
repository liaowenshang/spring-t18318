package com.edu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.service.CalculatorService;

public class CalCulatorAOPTest {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		CalculatorService calculatorService = (CalculatorService) context.getBean("calculatorService");
		calculatorService.cal(1, 1);
	}

}
