package com.edu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.service.CalculatorService;
import com.edu.service.CalculatorService2;

public class CalCulatorAOPTest2 {
	@Test
	public void test() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
		CalculatorService2 calculatorService = (CalculatorService2) context.getBean("calculatorService2");
		calculatorService.cal(1, 1);
	}

}
