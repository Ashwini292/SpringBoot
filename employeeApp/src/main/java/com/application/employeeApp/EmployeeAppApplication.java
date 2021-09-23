package com.application.employeeApp;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class EmployeeAppApplication implements CommandLineRunner{

	/*@Autowired(required=true)
	private EmployeeRepository repository;
	
	
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
	
	@PostMapping void insert(@RequestBody Employee emp) {
		List<Employee> employees = new ArrayList<Employee>();
		repository.saveAll(employees);
		//jdbcTemplate.update(insert);
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable("id") String id) {
		repository.deleteById(id);
	}*/
	
		

	public static void main(String[] args) {
		SpringApplication.run(EmployeeAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
