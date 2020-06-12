package com.edu.service.impl;

import com.edu.service.UserService;

public class UserServiceImpl implements UserService{
	private String name;
	
	public UserServiceImpl() {}
	public UserServiceImpl(String name) {		
		this.name = name;
	}
	
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void save(String name) {
		System.out.println("UserServiceImpl......save...");
		
	}

	@Override
	public void update(String name) {
		System.out.println("UserServiceImpl......update...");
		
	}

	@Override
	public String getId(Integer id) {
		System.out.println("UserServiceImpl......getId...");
		return "zhangsan";
	}

}
