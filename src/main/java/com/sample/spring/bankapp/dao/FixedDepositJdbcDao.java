package com.sample.spring.bankapp.dao;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;

import com.sample.spring.bankapp.domain.FixedDepositDetails;
import com.sample.spring.bankapp.utils.DatabaseInfo;

@SuppressWarnings("unused")
public class FixedDepositJdbcDao implements FixedDepositDao {
	private static Logger logger = Logger.getLogger(FixedDepositJdbcDao.class);
	private DatabaseInfo databaseInfo;
	
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

	public void setDatabaseInfo(DatabaseInfo databaseInfo) {
		this.databaseInfo = databaseInfo;
	}
}
