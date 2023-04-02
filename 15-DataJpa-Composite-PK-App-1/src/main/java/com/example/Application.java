package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.entity.Account;
import com.example.entity.AccountPk;
import com.example.repo.AccountRepo;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		AccountRepo bean = context.getBean(AccountRepo.class);
		
		AccountPk pk=new AccountPk();
		
		pk.setAccNum(123423156.00);
		pk.setAccType("current");
		
		
		Account acc=new Account();
		acc.setAccountPk(pk);
		acc.setBranch("darbhanga");
		acc.setHolderName("Ram");
		
		bean.save(acc);
	}

}
