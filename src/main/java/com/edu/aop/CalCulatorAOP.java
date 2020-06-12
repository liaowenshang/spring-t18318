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
			System.out.println("开始执行方法");
			obj = pjp.proceed();
			System.out.println("目标法执行完毕");
		} catch (Throwable e) {
			System.out.println("出现异常");
			
		}
		System.out.println("最后执行");
		
		
		
		
		return obj;
		
		
	}

}
