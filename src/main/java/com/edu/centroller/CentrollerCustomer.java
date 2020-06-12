package com.edu.centroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;

import com.edu.bean.Customer;
import com.edu.service.CentrolleService;

@Controller
public class CentrollerCustomer {
	 //到容器中去找这种bean，然后由容器自动把这个bean装起来
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
