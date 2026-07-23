package com.cognizant.loan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LoanApplication {

	public static void main(String[] args) {

		SpringApplication.run(LoanApplication.class, args);
		System.out.println("Loan application stated at 8081");
	}

}
