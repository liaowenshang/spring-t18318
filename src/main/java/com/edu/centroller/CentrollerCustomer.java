package com.edu.centroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.edu.bean.Customer;
import com.edu.service.CentrolleService;

@Controller
public class CentrollerCustomer {
	 //��������ȥ������bean��Ȼ���������Զ������beanװ����
	@Autowired	
	private CentrolleService centrolleService;
	
	public List<Customer> getAll(){
		return centrolleService.getAllCustomer();
	}

	public CentrolleService getCentrolleService() {
		return centrolleService;
	}

	public void setCentrolleService(CentrolleService centrolleService) {
		this.centrolleService = centrolleService;
	}
	
	

}
