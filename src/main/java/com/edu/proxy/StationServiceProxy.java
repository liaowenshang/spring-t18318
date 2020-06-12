package com.edu.proxy;

import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.springframework.util.ReflectionUtils.MethodCallback;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class StationServiceProxy implements MethodInterceptor {
	private Object targer;

	public StationServiceProxy(Object targer) {
		this.targer = targer;
	}
	
	public Object createProxy() {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(this.targer.getClass());
		enhancer.setCallback(this);
		return enhancer.create();
	}

	@Override
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.out.println("你执行了代理对象方法");
		proxy.invoke(this.targer, args);
		return null;
	}

}
