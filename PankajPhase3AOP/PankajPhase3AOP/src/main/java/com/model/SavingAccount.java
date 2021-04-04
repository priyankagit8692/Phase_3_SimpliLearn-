package com.model;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


public class SavingAccount implements InterestCalculator {
    private int duration = 6;
    private double roi = 7;

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
        return amount * roi / duration;
    }
}
