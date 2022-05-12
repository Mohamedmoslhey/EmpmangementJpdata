package com.nsag.springbranch.Empmangement.dao;

import java.util.List;

import javax.persistence.EntityManager;


import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nsag.springbranch.Empmangement.entity.Employee;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	public EntityManager entityManager;
	@Override
	public void deleteEmployee(int id) {
		Session session = entityManager.unwrap(Session.class);
         Query   theDQuery = session.createQuery("delete from Employee where id =:theId");
         theDQuery.setParameter("theId", id);
         theDQuery.executeUpdate();
	}

	@Override
	public Employee updaCreate(Employee employee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(employee);
		return null;
	}

	@Override
	public List<Employee> listofEmployee() {
		
		Session session = entityManager.unwrap(Session.class);
		Query<Employee> query = session.createQuery("from Employee",Employee.class );
		List<Employee> listOfEmp = query.getResultList();
		// TODO Auto-generated method stub
		return listOfEmp;
	}

	@Override
	public Employee getEmployee(int id) {
		Session session = entityManager.unwrap(Session.class);
		Employee siInfo = session.get(Employee.class, id);
		return siInfo;
	}

}
