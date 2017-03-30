package com.zjw.dubbo.provider.service;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConsumerServiceTest {
	private ProviderService providerService;

	@Before
	public void setUp() throws Exception {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"classpath:dubbo/*.xml");
		this.providerService = applicationContext.getBean(ProviderService.class);
	}

	@Test
	public void testQueryAll() {
		System.out.println(providerService.add(1, 2));
		
	}
}
