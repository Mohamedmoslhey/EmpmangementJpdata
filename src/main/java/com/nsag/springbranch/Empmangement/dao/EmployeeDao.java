package com.nsag.springbranch.Empmangement.dao;

import java.util.List;


import com.nsag.springbranch.Empmangement.entity.Employee;

public interface EmployeeDao {

	public void deleteEmployee(int id);
	public Employee updaCreate(Employee employee);
	public List<Employee> listofEmployee();
	public Employee getEmployee(int id);
}
