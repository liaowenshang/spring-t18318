package com.edu.factory;

import com.edu.bean.Orders;

public class OrdersFactory {
	public static Orders getOrders() {
		System.out.println("��̬�ġ���������������");
		return new Orders();
		
	}
	
	public Orders getOrders2() {	
		System.out.println("ʵ������������������");
		return new Orders();
	}

}
