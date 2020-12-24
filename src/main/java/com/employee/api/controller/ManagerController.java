package com.employee.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.employee.api.entity.Manager;
import com.employee.api.service.ManagerService;

@RestController
@RequestMapping("/manager")
@CrossOrigin(origins = "*")
public class ManagerController {
	
	@Autowired
	ManagerService managerService;

	@PostMapping("/register")
	public Manager registerManager(@RequestBody Manager manager) {
		return managerService.registerManager(manager);
	}
	
	@GetMapping("/login")
	public boolean managerLogin(@RequestParam String email,@RequestParam String password)
	{
		return managerService.loginManager(email, password);
	}
	
}
