package com.edu.test;

import org.junit.Test;

import com.edu.proxy.UserServiceProxy;
import com.edu.service.UserService;
import com.edu.service.impl.UserServiceImpl;

public class UserServiceProxyTest {
	@Test
	public void test() {
		UserServiceProxy userServiceProxy = //
				new UserServiceProxy(new UserServiceImpl("lis"));

		UserService userService = (UserService) userServiceProxy.createProxy();

		userService.save("zhangsan");
	}

}
