package com.sample.spring.bankapp.utils;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.sample.spring.bankapp.domain.BankStatement;
import com.sample.spring.bankapp.domain.FixedDepositDetails;


public class DatabaseOperations {

	private static Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public boolean saveFd(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
		return true;
	}

	public FixedDepositDetails loadFd(long id) {
		return fixedDeposits.get(id);
	}

	public BankStatement getMiniStatement() {
		BankStatement bankStatement = new BankStatement();
		bankStatement.setAmount(100).setReferenceNumber("Ref. no. 1")
				.setTransactionDate(new Date()).setTransactionType("credit");
		return bankStatement;
	}
}
