package com.client;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.model.CurrentAccount;
import com.model.FixedAccount;
import com.model.SalaryAccount;
import com.model.SavingAccount;
import com.service.BankingService;

@Configuration
public class AppConfig {
	// as container has to take care of this App config so we apply @Bean
	@Bean
	public FixedAccount fa() {
		return new FixedAccount();
	}
	@Bean
	public SavingAccount sa() {
		return new SavingAccount();
	}
	@Bean
	public CurrentAccount ca() {
		return new CurrentAccount();
	}
	@Bean
	public SalaryAccount sal() {
		return new SalaryAccount();
	}
	@Bean
	public BankingService service() {
		return new BankingService(sa());
	}
	
}
