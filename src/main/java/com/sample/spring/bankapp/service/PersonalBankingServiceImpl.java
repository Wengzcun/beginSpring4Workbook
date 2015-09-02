package com.sample.spring.bankapp.service;

import com.sample.spring.bankapp.dao.PersonalBankingDao;
import com.sample.spring.bankapp.domain.BankStatement;

public class PersonalBankingServiceImpl implements PersonalBankingService {
	private PersonalBankingDao personalBankingDao;
	public void setPersonalBankingDao(PersonalBankingDao personalBankingDao) {
		this.personalBankingDao = personalBankingDao;
	}
	@Override
	public BankStatement getMiniStatement() {
		return personalBankingDao.getMiniStatement();
	}
}
