package com.sample.spring.bankapp;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.bankapp.controller.FixedDepositController;

public class BankApp {
	private static Logger logger = Logger.getLogger(BankApp.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		FixedDepositController fixedDepositController = (FixedDepositController) context.getBean("controller");
		logger.info("Submissions status of fixed deposit : " + fixedDepositController.submit());
		logger.info("Returned fixed deposit info : " + fixedDepositController.get());
	}
}
