package com.org.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeJdbcImpl implements EmployeeDao {
	public EmployeeJdbcImpl() {
		System.out.println("---EmployeeJdbcImpl created----");
	}

	@Override
	public void store() {
		System.out.println("---store() called in EmployeeJdbcImpl----");

	}

	@Override
	public void delete() {
		System.out.println("---delete() called in EmployeeJdbcImpl----");

	}

}
