package com.sample.spring.bankapp.service;

import org.apache.log4j.Logger;

import com.sample.spring.bankapp.dao.FixedDepositDao;
import com.sample.spring.bankapp.domain.FixedDepositDetails;

public class FixedDepositServiceImpl implements FixedDepositService{
	private static Logger logger = Logger.getLogger(FixedDepositServiceImpl.class);
	private FixedDepositDao fixedDepositDao;
	
	public FixedDepositServiceImpl() {
		logger.info("initializing");
	}

	public void setFixedDepositDao(FixedDepositDao fixedDepositDao) {
		logger.info("Setting fixedDepositDao property");
		this.fixedDepositDao = fixedDepositDao;
	}
	
	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}
	
	public boolean createFixedDeposit(FixedDepositDetails details) {
		return fixedDepositDao.createFixedDeposit(details);
	}
}
