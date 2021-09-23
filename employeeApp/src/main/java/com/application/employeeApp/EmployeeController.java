package com.application.employeeApp;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCallback;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	@Autowired
	EmployeeRepository repository;
		
	@GetMapping("/")
	  public String home() {
		  return "Hello World!";
	  }
	
	@GetMapping("/employees")
	public List<Employee> EmployeeList(){
		List<Employee> list = repository.findAll();
		return list;
	}
	
	@PutMapping("/")
	public void update(@RequestBody Employee emp) {
		repository.save(emp);		
	}
	
	@PostMapping("/employee")
	public void insert(@RequestBody Employee emp) {
		List<Employee> employees = new ArrayList<Employee>();
		repository.saveAll(employees);
		//jdbcTemplate.update(insert);
		System.out.println("Post Method");
		//return service.saveEmployeeByPreparedStatement(emp);
		repository.save(emp);
	}
	
	@PostMapping("/employees")
	public void insert(@RequestBody List<Employee> employees) {
		repository.saveAll(employees);
		//jdbcTemplate.update(insert);
	}
	
	@DeleteMapping("/employees/{id}")
	public void delete(@PathVariable("id") int id, Employee emp) {
		repository.delete(emp);
	}
	
	//Below apis are failing
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable("id") int id, Employee emp){
		repository.findById(id);
		return emp;
	}
	
	@GetMapping("/employees/{gender}")
	public List<Employee> emplist(String gender){
		List<Employee> list = new ArrayList<Employee>();
		//service.employeeListByGender(gender);
		return list;
	}
	
	

}


