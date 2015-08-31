package com.sample.spring.bankapp.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.sample.spring.bankapp.domain.FixedDepositDetails;

@SuppressWarnings("unused")
public class FixedDepositJdbcDao implements FixedDepositDao {
	private static Logger logger = Logger.getLogger(FixedDepositJdbcDao.class);
	private String url;
	private String driverClass;
	private String username;
	private String password;
	
	private Map<Long, FixedDepositDetails> fixedDeposits = new HashMap<Long, FixedDepositDetails>();

	public FixedDepositJdbcDao() {
		logger.info("initializing");
	}
	
	public FixedDepositDetails getFixedDepositDetails(long id) {
		return fixedDeposits.get(id);
	}

	public boolean createFixedDeposit(FixedDepositDetails fdd) {
		fixedDeposits.put(fdd.getId(), fdd);
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
