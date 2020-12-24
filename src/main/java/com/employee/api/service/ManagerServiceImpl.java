package com.employee.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.employee.api.entity.Manager;
import com.employee.api.repository.ManagerRepository;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class ManagerServiceImpl implements ManagerService {

	@Autowired
	ManagerRepository managerRepository;

	@Override
	public Manager registerManager(Manager manager) {
		// TODO Auto-generated method stub
		log.info("Registering user - "+manager.getEmail());
		return managerRepository.save(manager);
	}

	@Override
	public boolean loginManager(String email, String password) {
		// TODO Auto-generated method stub
		log.info("Inside login method");
		Manager manager = managerRepository.findByEmail(email);

		if (manager.getPassword().equals(password))
			return true;
		else
			return false;
	}

}
