package com.edu.test;

import org.junit.Test;

import com.edu.proxy.StationServiceProxy;
import com.edu.service.StationService;

public class StationServiceTest {
	@Test
	public void test() {
		StationServiceProxy serviceProxy = //
				new StationServiceProxy(new StationService());
		StationService service = (StationService) serviceProxy.createProxy();
		service.say();
	}

}
