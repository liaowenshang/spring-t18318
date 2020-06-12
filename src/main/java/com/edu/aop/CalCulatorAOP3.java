package com.edu.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class CalCulatorAOP3 {
	@Pointcut(value="execution(* com.edu.service.*.*(..))")
	public void say() {}
	
	@Before(value="say()")
	public void beforeCal() {
		System.out.println("CalCulatorAOP......beforeCal...");
	}
	
	@After("say()")
	public void afterCal() {
		System.out.println("CalCulatorAOP......afterCal...");
	}
	
	@AfterReturning("say()")
	public void afterReturing() {
		System.out.println("CalCulatorAOP......afterReturing...");
	}
	
	@AfterThrowing("say()")
	public void afterThrowing() {
		System.out.println("CalCulatorAOP......afterThrowing...");
	}
	
	
	@Around("say()")
	public Object aroundCal(ProceedingJoinPoint pjp) {
		Object obj = null;
		
		try {
			System.out.println("��ʼִ�з���");
			obj = pjp.proceed();
			System.out.println("Ŀ�귨ִ�����");
		} catch (Throwable e) {
			System.out.println("�����쳣");
			
		}
		System.out.println("���ִ��");
		
		
		
		
		return obj;
		
		
	}

}
