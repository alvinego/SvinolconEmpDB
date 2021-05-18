package com.example.demo.employee;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
public class EmployeeService {
	
	private final EmployeeRepository employeeRepository;
	
	@Autowired
	public EmployeeService(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@GetMapping
	public List<Employee> getEmployees(){
		return employeeRepository.findAll();
	}

	public void addNewEmployee(Employee employee) {
		
		Optional<Employee> employeeOptional = employeeRepository.findEmployeeByEmail(employee.getEmail());
		
		if(employeeOptional.isPresent()) {
			throw new IllegalStateException("email taken");
		}
		employeeRepository.save(employee);
	
	}

	public void deleteEmployee(long employeeId) {
		
		boolean exists = employeeRepository.existsById(employeeId);
		if(!exists) {
			throw new IllegalStateException("employee with id"+ employeeId +"does not exist");
			
		}
		employeeRepository.deleteById(employeeId);
	}

}
