package com.edu.factory;

import com.edu.bean.Orders;

public class OrdersFactory {
	public static Orders getOrders() {
		System.out.println("床蓑議。。。。。。。。");
		return new Orders();
		
	}
	
	public Orders getOrders2() {	
		System.out.println("糞箭。。。。。。。。");
		return new Orders();
	}

}
