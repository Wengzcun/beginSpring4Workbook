package com.sample.spring.bankapp.controller;

import com.sample.spring.bankapp.domain.FixedDepositDetails;

public interface FixedDepositController {
	public boolean submit();	
	public FixedDepositDetails get();
}
