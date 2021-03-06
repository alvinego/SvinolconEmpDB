package com.example.demo.employee;

import java.time.LocalDate;
import java.time.Period;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table
public class Employee {
	
	@Id
	@SequenceGenerator(
			name = "employee_sequence",
			sequenceName = "employee_sequence",
			allocationSize = 1
			)
	
	@GeneratedValue(
			strategy=GenerationType.SEQUENCE,
			generator = "employee_sequence"
			)
	private long id;
	private String firstName;
	private String lastName;
	private String email;
	private LocalDate DoB;
	@Transient
	private Integer age;
	
	public Employee(long id, String firstName, String lastName, String email, LocalDate doB) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DoB = doB;
	}

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String email, LocalDate doB) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DoB = doB;
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDate getDoB() {
		return DoB;
	}

	public void setDoB(LocalDate doB) {
		DoB = doB;
	}

	public Integer getAge() {
		return Period.between(this.DoB, LocalDate.now()).getYears();
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email
				+ ", DoB=" + DoB + ", age=" + age + "]";
	}

	
	
}
