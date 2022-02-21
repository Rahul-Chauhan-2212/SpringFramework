package com.spring.boot;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.spring.boot.entity.Employee;
import com.spring.boot.repository.EmployeeRepository;

@SpringBootApplication
public class SpringBootDataJpaApplication {

	EmployeeRepository employeeRepository;

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBootDataJpaApplication.class, args);
		EmployeeRepository repo = context.getBean(EmployeeRepository.class);
		Employee employee = new Employee();
		employee.setName("Rahul");
		employee.setDepartment("IT");
		Employee employee1 = new Employee();
		employee1.setName("Kiran");
		employee1.setDepartment("Admin");
		List<Employee> employees = Arrays.asList(employee, employee1);
		// Iterable<Employee> emp = repo.saveAll(employees);
		// Employee emp = repo.save(employee);
		// emp.forEach(System.out::println);
		//Optional<Employee> findById = repo.findById(1);
		//Iterable<Employee> findAll = repo.findAll();
		//findAll.forEach(System.out::println);
		//System.out.println(findById.get());
		repo.deleteById(1);
	}

}
