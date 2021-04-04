package com.model;


public class FixedAccount implements InterestCalculator{
	
	private double roi=4.5;
	private double duration= 5;

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
	public FixedAccount() {
		System.out.println("inside fa");
	}
}
