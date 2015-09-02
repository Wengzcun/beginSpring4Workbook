package com.sample.spring.bankapp.dao;

import com.sample.spring.bankapp.domain.BankStatement;
import com.sample.spring.bankapp.utils.DatabaseOperations;

public class PersonalBankingDaoImpl implements PersonalBankingDao{
	private DatabaseOperations databaseOperations;

	public DatabaseOperations getDatabaseOperations() {
		return databaseOperations;
	}

	public void setDatabaseOperations(DatabaseOperations databaseOperations) {
		this.databaseOperations = databaseOperations;
	}

	@Override
	public BankStatement getMiniStatement() {
		return databaseOperations.getMiniStatement();
	}

}
