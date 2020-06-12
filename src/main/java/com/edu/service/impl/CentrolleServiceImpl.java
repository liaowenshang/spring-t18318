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
    //��������ȥ������bean��Ȼ���������Զ������beanװ����
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
