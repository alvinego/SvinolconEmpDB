package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EmployeeConfig{
	
	@Bean
	CommandLineRunner commandLineRunner(EmployeeRepository employeeRepository) {
		
		return arg -> {
					Employee Constance = new Employee(
							"Constance",
							"Nwaukoni",
							"constance.nwaukoni@svinolcon.com",
							LocalDate.of(2000,Month.NOVEMBER,10),
							21
							);
					Employee Alex = new Employee(
							"Alex",
							"Osho",
							"alex.osho@svinolcon.com",
							LocalDate.of(2000,Month.NOVEMBER,10),
							24
							);
					
					employeeRepository.saveAll(
							List.of(Constance, Alex)
							);
			
		};
	}
}
