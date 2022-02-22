package com.spring.boot.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.spring.boot.entity.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

	public List<Employee> findByName(String name);

	@Query("select e from Employee e where e.department=:dept")
	public List<Employee> getEmployeeByDeparment(@Param("dept") String dept);

	@Query(value = "select * from Employee", nativeQuery = true)
	public List<Employee> getAllEmployees();

}
