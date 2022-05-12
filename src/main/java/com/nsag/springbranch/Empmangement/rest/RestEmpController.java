package com.nsag.springbranch.Empmangement.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nsag.springbranch.Empmangement.entity.Employee;
import com.nsag.springbranch.Empmangement.service.EmployeeService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api")
public class RestEmpController {

	@Autowired
	private EmployeeService empService;
	
	@GetMapping("/employees")
	public List<Employee> getList(){
		
		return empService.listofEmployee();
	}
	
	@PostMapping("/employees")
	public Employee creatEmployeeProfile(@RequestBody Employee employee){
		employee.setId(0);
		return empService.updaCreate(employee);
	}
	@PutMapping("/employees")
	public Employee updEmployeeProfile(@RequestBody Employee employee){
		
		return empService.updaCreate(employee);
	}
	
	@GetMapping("/employees/{theEmplId}")
	public Employee getList(@PathVariable int theEmplId){
		
		return empService.getEmployee(theEmplId);
	}
	
	@DeleteMapping("/employees/{theEmplId}")
	public void delEmpl(@PathVariable int theEmplId){
		
		empService.deleteEmployee(theEmplId);
	}
}
