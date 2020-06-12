package com.edu.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import com.edu.service.impl.UserServiceImpl;

public class UserServiceProxy implements InvocationHandler {
	private Object targer;

	public UserServiceProxy(Object targer) {
		this.targer = targer;
	}
	
	public Object createProxy() {
		return Proxy.newProxyInstance(targer.getClass().getClassLoader(),targer.getClass().getInterfaces() , this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		UserServiceImpl userServiceImpl = (UserServiceImpl) this.targer;
		String name=userServiceImpl.getName();
		System.out.println("=========ִ�д�����========");
		if (name !=null) {
			return method.invoke(this.targer, args);
		}
		System.out.println("=======��û��ִ�����������Ȩ��=======");
		return null;
	}

}
