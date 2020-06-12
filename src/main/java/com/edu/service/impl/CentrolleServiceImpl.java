package com.edu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.edu.bean.Customer;
import com.edu.dao.CentrolleDao;
import com.edu.service.CentrolleService;

@Service(value = "centrolleService")
public class CentrolleServiceImpl implements CentrolleService {
    //到容器中去找这种bean，然后由容器自动把这个bean装起来
	@Autowired
	@Qualifier(value = "centrolleDao")
	private CentrolleDao centrolleDao;

	@Override
	public List<Customer> getAllCustomer() {

		return centrolleDao.getAllCustomer();
	}

	public CentrolleDao getCentrolleDao() {
		return centrolleDao;
	}

	public void setCentrolleDao(CentrolleDao centrolleDao) {
		this.centrolleDao = centrolleDao;
	}

}
