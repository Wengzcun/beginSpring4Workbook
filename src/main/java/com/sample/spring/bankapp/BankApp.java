package com.sample.spring.bankapp;


import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.sample.spring.bankapp.controller.FixedDepositController;
import com.sample.spring.bankapp.controller.PersonalBankingController;
import com.sample.spring.bankapp.domain.FixedDepositDetails;

public class BankApp {
	private static Logger logger = Logger.getLogger(BankApp.class);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("classpath:META-INF/spring/applicationContext.xml");
		FixedDepositController fixedDepositController = (FixedDepositController) context.getBean(FixedDepositController.class);
		logger.info("Submissions status of fixed deposit : " + fixedDepositController.submit(context
				.getBean(FixedDepositDetails.class).setDepositAmount(100)
				.setEmail("someemail@somedomain.com").setId(1).setTenure(10)));
		logger.info("Returned fixed deposit info : " + fixedDepositController.get());

		PersonalBankingController personalBankingController = context
				.getBean(PersonalBankingController.class);
		logger.info(personalBankingController.getMiniStatement());
	}
}
