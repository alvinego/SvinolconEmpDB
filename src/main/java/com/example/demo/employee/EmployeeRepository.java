package com.example.demo.employee;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//import com.sun.el.stream.Optional;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
	//@Query (SELECT e FROM employee e WHERE e.email = ?1)//this is JBQL not SQL
	Optional<Employee> findEmployeeByEmail(String email);

}
