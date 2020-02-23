package com.learning.streams;

import com.learning.domain.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BasicStreamsOperations {

	public static void main(String[] args) {
		BasicStreamsOperations ops = new BasicStreamsOperations();
		List<Employee> employeeList = ops.createEmployeeList();
		employeeList.stream().forEach(e -> System.out.println(e));
		System.out.println("Employee count: " + ops.give_me_count_of_employees_in_list_using_streams(employeeList));
		System.out.println("Count of employees with salary greater than 10000: " + ops.give_me_employees_with_salary_greater_than_1000(employeeList));
		System.out.println("Sum of salaries: " + ops.give_me_sum_of_salaries_of_all_employees(employeeList));
	}

	public List<Employee> createEmployeeList() {
		List<Employee> emplList = new ArrayList<>();
		//using IntStream to get a char array of alphabets
		char[] charArray = IntStream.rangeClosed('A', 'Z').mapToObj(c -> "" + (char) c).collect(Collectors.joining()).toCharArray();
		//using a stream operation to get 1000 objects generated
		new Random().ints(1000, 0, 25).
				forEach(i -> emplList.add(new Employee(""+charArray[i], ""+charArray[i], ""+charArray[i], i*1000)));
		return  emplList;
	}

	public Employee createEmployee1(String firstName, String lastName, String role, double salary) {
		Employee e = new Employee(firstName, lastName, role, salary);
		return e;
	}

	public long give_me_count_of_employees_in_list_using_streams(List<Employee> employeeList) {
		return employeeList.stream().count();
	}

	public long give_me_employees_with_salary_greater_than_1000(List<Employee> employeeList) {
		return employeeList.stream().filter(e -> e.getSalary() > 10000).count();
	}

	public double give_me_sum_of_salaries_of_all_employees(List<Employee> employeeList) {
		return employeeList.stream().collect(Collectors.summarizingDouble(e -> e.getSalary())).getSum();
	}

}
