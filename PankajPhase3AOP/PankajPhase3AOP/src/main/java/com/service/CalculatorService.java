package com.service;

import com.model.InterestCalculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Service(value = "service")
public class CalculatorService {
//    @Autowired
//    @Qualifier(value = "sal")
    private InterestCalculator ic;

    public InterestCalculator getIc() {
        return ic;
    }

    public CalculatorService(InterestCalculator ic) {
        this.ic = ic;
    }

    public void setIc(InterestCalculator ic) {
        this.ic = ic;
    }

    public double service(double amount){
    	System.out.println("inside service"); //@after is called after this statement before the return
        return ic.calculateInterest(amount);
    }
}
