package com.sample.spring.bankapp.dao;


public class FixedDepositDaoFactory {

	public FixedDepositDaoFactory() {
	}
	
	/* static factory method */
	/* public static FixedDepositDao getFixedDepositDao(String daoType) { */
	public FixedDepositDao getFixedDepositDao(String daoType) {
		FixedDepositDao fixedDepositDao = null;
		
		if("jdbc".equalsIgnoreCase(daoType)) {
			System.out.println("Creating FixedDepositDao");
			if(fixedDepositDao == null) {
				fixedDepositDao = new FixedDepositJdbcDao();
			}
		} else if("hibernate".equalsIgnoreCase(daoType)) {
			System.out.println("Creating FixedDepositDao");
			if(fixedDepositDao == null) {
				fixedDepositDao = new FixedDepositHibernateDao();
			}
		}
		return fixedDepositDao;
	}
}
