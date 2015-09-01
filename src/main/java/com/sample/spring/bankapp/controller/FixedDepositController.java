package com.sample.spring.bankapp.controller;

import com.sample.spring.bankapp.domain.FixedDepositDetails;
import com.sample.spring.bankapp.service.FixedDepositService;

public interface FixedDepositController {
	public boolean submit();	
	public FixedDepositDetails get();
	public FixedDepositService getFixedDepositService();
}
