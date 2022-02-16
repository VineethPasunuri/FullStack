package com.org.dao;

import org.springframework.stereotype.Repository;

@Repository
public class EmployeeORMImpl implements EmployeeDao {

	public EmployeeORMImpl() {
		System.out.println("---EmployeeORMImpl Created----");
	}

	@Override
	public void store() {
		System.out.println("---store() called in EmployeeORMImpl----");

	}

	@Override
	public void delete() {
		System.out.println("---delete() called in EmployeeORMImpl----");

	}

}
