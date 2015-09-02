package com.sample.spring.bankapp.controller;

import com.sample.spring.bankapp.domain.BankStatement;
import com.sample.spring.bankapp.service.PersonalBankingService;

public class PersonalBankingControllerImpl implements PersonalBankingController {
	private PersonalBankingService personalBankingService;

	public void setPersonalBankingService(
			PersonalBankingService personalBankingService) {
		this.personalBankingService = personalBankingService;
	}

	@Override
	public BankStatement getMiniStatement() {
		return personalBankingService.getMiniStatement();
	}

}
