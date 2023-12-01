package com.GhostSanket14.CollegeActivityportfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.GhostSanket14.CollegeActivityportfolio.Model.StudentLoginData;
import com.GhostSanket14.CollegeActivityportfolio.Service.AdminLoginDataService;

@RestController
@RequestMapping("/student")
public class StudentLogin {
	
	@Autowired
	AdminLoginDataService adminLoginDataService;
	
	// This will verify if the user exists or not. If yes then he will be taken to dashboard.
	@GetMapping("/loginVerify")
	public StudentLoginData loginVerify(@RequestParam("prn") int prnNo, @RequestParam("pass") int studPass ){
		return adminLoginDataService.verify(prnNo, studPass);
	}
	
	// API- Populate student dashboard.
	
	// API- Edit/fill student dashboard.
	
}