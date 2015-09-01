package com.sample.spring.bankapp;

import static org.junit.Assert.assertNotSame;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.bankapp.domain.FixedDepositDetails;

public class PrototypeTest {
	private static ApplicationContext context;
	
	@BeforeClass
	public static void init() {
		context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
	}
	
	@Test
	public void testInstance() {
		FixedDepositDetails details1 = (FixedDepositDetails)context.getBean("details");
		FixedDepositDetails details2 = (FixedDepositDetails)context.getBean("details");

		assertNotSame("Same FixedDepositDetails instances", details2, details1);
	}
}
