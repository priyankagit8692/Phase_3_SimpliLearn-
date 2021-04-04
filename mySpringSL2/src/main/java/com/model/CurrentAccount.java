package com.model;


import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


public class CurrentAccount implements InterestCalculator {

	private double roi=2.5;
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

	public CurrentAccount() {
		System.out.println("inside CURR");
	}
	
	@Override
	public double calculate(double amount) {
		// TODO Auto-generated method stub
		return amount*roi/duration;
	}
}
