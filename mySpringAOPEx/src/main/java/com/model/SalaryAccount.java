package com.model;


import org.springframework.stereotype.Component;

public class SalaryAccount implements InterestCalculator {

	private double roi=1;
	private double duration=5;

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
	
	public SalaryAccount() {
		System.out.println("inside sal");
	}
	
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi/duration;
	}
}
