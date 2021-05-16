package com.example.demo.employee;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

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
	private Integer age;
	
	public Employee(long id, String firstName, String lastName, String email, LocalDate doB, Integer age) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DoB = doB;
		this.age = age;
	}

	public Employee() {
		super();
	}

	public Employee(String firstName, String lastName, String email, LocalDate doB, Integer age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		DoB = doB;
		this.age = age;
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
		return age;
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
