package com.sample.spring.bankapp.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.sample.spring.bankapp.domain.FixedDepositDetails;

@SuppressWarnings("unused")
public class FixedDepositDaoImpl implements FixedDepositDao {
	private static Logger logger = Logger.getLogger(FixedDepositDaoImpl.class);
	private String url;
	private String driverClass;
	private String username;
	private String password;
	
	private FixedDepositDao fixedDepositDao;

	public FixedDepositDaoImpl() {
		logger.info("initializing");
	}
	
	public void setFixedDepositDetails(FixedDepositDao fixedDepositDao) {
		this.fixedDepositDao = fixedDepositDao;
	}
	
	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDepositDao.getFixedDepositDetails(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails details) {
		this.fixedDepositDao.createFixedDeposit(details);
		return true;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public void setDriverClass(String driverClass) {
		this.driverClass = driverClass;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}	
}
