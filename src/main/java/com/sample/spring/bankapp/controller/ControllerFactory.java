package com.sample.spring.bankapp.controller;

public class ControllerFactory {
	public Object getController(String controllerName) {
		Object controller = null;
		if("fixedDepositController".equalsIgnoreCase(controllerName)) {
			controller = new FixedDepositControllerImpl();
		} else if("personalBankingController".equalsIgnoreCase(controllerName)) {
			controller = new PersonalBankingControllerImpl();
		} 
		return controller;
	}
}
