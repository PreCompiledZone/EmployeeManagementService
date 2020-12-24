package com.employee.api.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.employee.api.entity.Manager;

@Repository
public interface ManagerRepository extends CrudRepository<Manager,Integer>  {
	
	public Manager findByEmail(String email);
}
