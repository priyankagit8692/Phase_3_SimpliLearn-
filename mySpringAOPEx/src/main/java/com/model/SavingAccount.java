package com.model;

import org.springframework.stereotype.Component;

public class SavingAccount implements InterestCalculator{

	private double roi=5.5;
	private double duration= 6;

	public double getRoi() {
		return roi;
	}

	public void setRoi(double roi) {
		this.roi = roi;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi/duration;
	}
	public SavingAccount() {
		// TODO Auto-generated constructor stub
		System.out.println("inside sa");
	}
		
	


}
