package com.nsag.springbranch.Empmangement.service;

import java.util.List;


import com.nsag.springbranch.Empmangement.entity.Employee;

public interface EmployeeService {

	public void deleteEmployee(int id);
	public Employee updaCreate(Employee employee);
	public List<Employee> listofEmployee();
	public Employee getEmployee(int id);
}
