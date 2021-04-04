package com.model;

import org.springframework.stereotype.Component;

@Component(value = "ca")
public class CurrentAccount implements InterestCalculator{
    private int duration = 5;
    private double roi = 15;

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getRoi() {
        return roi;
    }

    public void setRoi(double roi) {
        this.roi = roi;
    }

    @Override
    public double calculateInterest(Double amount) {
        return amount*roi/duration;
    }
}
