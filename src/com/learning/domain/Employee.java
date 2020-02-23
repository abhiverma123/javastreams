package com.learning.domain;

public class Employee {

	private String firstName;
	private String lastName;
	private String role;
	private double salary;

	public Employee(String firstName, String lastName, String role, double salary) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.role = role;
		this.salary = salary;
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

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String toString() {
		return (" " + lastName + " with role " + role + " and salary " + salary);
	}
}
