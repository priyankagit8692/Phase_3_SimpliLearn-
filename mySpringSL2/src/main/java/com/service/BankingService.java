package com.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.model.InterestCalculator;


public class BankingService {
	
	private InterestCalculator ic;

	
	public double service(double amount) {
		return ic.calculate(amount);
	}
	

	public BankingService(InterestCalculator ic) {
		super();
		this.ic = ic;
	}



	@PostConstruct
	public void init() {
		System.out.println("init");
	}
	@PreDestroy
	public void destroy() {
		System.out.println("destroy");
	}

}
