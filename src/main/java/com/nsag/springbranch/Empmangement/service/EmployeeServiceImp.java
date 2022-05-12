package com.nsag.springbranch.Empmangement.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.nsag.springbranch.Empmangement.dao.EmpJpaRepositry;
import com.nsag.springbranch.Empmangement.dao.EmployeeDao;
import com.nsag.springbranch.Empmangement.entity.Employee;

@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	/*@Qualifier("employeeDaoImpJpa")*/
	public EmpJpaRepositry empJpaRepo;
	
	@Override
	public void deleteEmployee(int id) {
		empJpaRepo.deleteById(id);
	}

	@Override
	public Employee updaCreate(Employee employee) {
		
		return empJpaRepo.save(employee);
	}

	@Override
	public List<Employee> listofEmployee() {
		return empJpaRepo.findAll();
	}

	@Override
	public Employee getEmployee(int id) {
	Optional<Employee> empres = empJpaRepo.findById(id);
	Employee employee = null;
	if(empres.isPresent()){
		employee = empres.get();
	}
		return employee;
	}

}
