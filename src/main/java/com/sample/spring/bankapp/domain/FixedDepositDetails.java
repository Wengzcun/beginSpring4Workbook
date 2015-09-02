package com.sample.spring.bankapp.domain;

public class FixedDepositDetails {
	private long id;
	private float depositAmount;
	private int tenure;
	private String email;
	
	public FixedDepositDetails() {
		
	}
	
	public FixedDepositDetails(long id, float depositAmount, int tenure, String email) {
		this.id = id;
		this.depositAmount = depositAmount;
		this.tenure = tenure;
		this.email = email;
	}
	
	public long getId() {
		return id;
	}

	public FixedDepositDetails setId(long id) {
		this.id = id;
		return this;
	}

	public float getDepositAmount() {
		return depositAmount;
	}

	public FixedDepositDetails setDepositAmount(float depositAmount) {
		this.depositAmount = depositAmount;
		return this;
	}

	public int getTenure() {
		return tenure;
	}

	public FixedDepositDetails setTenure(int tenure) {
		this.tenure = tenure;
		return this;
	}

	public String getEmail() {
		return email;
	}

	public FixedDepositDetails setEmail(String email) {
		this.email = email;
		return this;
	}

	public String toString() {
		return "id :" + id + ", deposit amount : " + depositAmount
				+ ", tenure : " + tenure + ", email : " + email;
	}
}
