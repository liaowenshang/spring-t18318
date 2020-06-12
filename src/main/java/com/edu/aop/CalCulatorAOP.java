package com.edu.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class CalCulatorAOP {
	public void beforeCal() {
		System.out.println("CalCulatorAOP......beforeCal...");
	}
	
	public void afterCal() {
		System.out.println("CalCulatorAOP......afterCal...");
	}
	
	public void afterReturing() {
		System.out.println("CalCulatorAOP......afterReturing...");
	}
	
	public void afterThrowing() {
		System.out.println("CalCulatorAOP......afterThrowing...");
	}
	
	
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
