package com.employee.api.service;

import com.employee.api.entity.Manager;

public interface ManagerService {
	
	public Manager registerManager(Manager manager);
	
	public boolean loginManager(String email,String password);

}
