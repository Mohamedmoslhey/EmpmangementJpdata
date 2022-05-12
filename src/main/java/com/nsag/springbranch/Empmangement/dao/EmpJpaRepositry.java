package com.nsag.springbranch.Empmangement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nsag.springbranch.Empmangement.entity.Employee;

public interface EmpJpaRepositry extends JpaRepository<Employee, Integer> {

}
