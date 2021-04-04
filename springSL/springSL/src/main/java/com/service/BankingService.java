package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;

@Service(value = "service")
public class BankingService {
	
	@Autowired
	@Qualifier(value = "fa")
	private InterestCalculator ic;

	public InterestCalculator getIc() {
		return ic;
	}

	public void setIc(InterestCalculator ic) {
		this.ic = ic;
	}
	
	
	public double service(double amount) {
		return ic.calculate(amount);
	}

}
