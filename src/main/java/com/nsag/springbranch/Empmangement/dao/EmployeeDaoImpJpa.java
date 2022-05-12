package com.nsag.springbranch.Empmangement.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nsag.springbranch.Empmangement.entity.Employee;

@Repository
public class EmployeeDaoImpJpa implements EmployeeDao {

	@Autowired
	public EntityManager entityManager;
	@Override
	public void deleteEmployee(int id) {
		
         Query   theDQuery = entityManager.createQuery("delete from Employee where id =:theId");
         theDQuery.setParameter("theId", id);
         theDQuery.executeUpdate();
	}

	@Override
	public Employee updaCreate(Employee employee) {
		Employee employeh = entityManager.merge(employee);
		
		return employeh;
	}

	@Override
	public List<Employee> listofEmployee() {
		
		Query query = entityManager.createQuery("from Employee");
		List<Employee> listOfEmp = query.getResultList();
		// TODO Auto-generated method stub
		return listOfEmp;
	}

	@Override
	public Employee getEmployee(int id) {
		Employee siInfo = entityManager.find(Employee.class, id);
		return siInfo;
	}

}
