package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeService {
	
	@GetMapping
	public List<Employee> getEmployees(){
		return List.of(
				new Employee(
						1l,
						"Constance",
						"Nwaukoni",
						"constance.nwaukoni@svinolcon.com",
						LocalDate.of(2000,Month.NOVEMBER,10),
						21
						)
				);
	}

}
