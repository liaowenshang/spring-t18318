package com.edu.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.edu.config.MainConfig2;
import com.edu.service.CalculatorService;
import com.edu.service.CalculatorService2;
import com.edu.service.CalculatorService3;

public class CalCulatorAOPTest3 {
	@Test
	public void test() {
		AnnotationConfigApplicationContext context=//
				new AnnotationConfigApplicationContext(MainConfig2.class);
		CalculatorService3 calculatorService = (CalculatorService3) context.getBean("calculatorService3");
		calculatorService.cal(1, 1);
	}

}
