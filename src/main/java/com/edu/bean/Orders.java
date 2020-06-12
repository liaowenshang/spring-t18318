package com.edu.bean;

import java.util.Date;

public class Orders {
	private String id;
	private Float total;

	private int orderstate;
	private String name;
	private String address;
	private String phone;
	private int cid;
	
	private Customer customer;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Float getTotal() {
		return total;
	}
	public void setTotal(Float total) {
		this.total = total;
	}
	
	public int getOrderstate() {
		return orderstate;
	}
	public void setOrderstate(int orderstate) {
		this.orderstate = orderstate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	
	
	
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Orders() {
		System.out.println("¡£¡£¡£orders±»ÊµÀý»¯¡£¡£¡£");
		
	}
	public Orders(String id, Float total, String name, String address) {
		super();
		this.id = id;
		this.total = total;
		this.name = name;
		this.address = address;
	}
	@Override
	public String toString() {
		return "Orders [id=" + id + ", total=" + total + ", orderstate=" + orderstate + ", name=" + name + ", address="
				+ address + ", phone=" + phone + ", cid=" + cid + ", customer=" + customer + "]";
	}
	
	
	
	

	
}
