package com.client;

import com.model.FixedAccount;
import com.model.SavingAccount;
import com.service.CalculatorService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class AppConfig {
    @Bean
    public FixedAccount fa(){
        return new FixedAccount();
    }

    @Bean
    public SavingAccount sa(){
        return new SavingAccount();
    }

    @Bean
    public CalculatorService service(){
        return new CalculatorService(fa());
    }
}
