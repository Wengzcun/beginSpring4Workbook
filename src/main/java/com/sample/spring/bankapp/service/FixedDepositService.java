package com.sample.spring.bankapp.service;

import com.sample.spring.bankapp.dao.FixedDepositDao;
import com.sample.spring.bankapp.domain.FixedDepositDetails;

public interface FixedDepositService {	
	public FixedDepositDetails getFixedDepositDetails(long id);
	public FixedDepositDao getFixedDepositDao();
	public boolean createFixedDeposit(FixedDepositDetails details);
}
