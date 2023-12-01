package com.GhostSanket14.CollegeActivityportfolio.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.GhostSanket14.CollegeActivityportfolio.DTO.AdmniLoginDataDTO;
import com.GhostSanket14.CollegeActivityportfolio.DTO.StudentLoginDataDTO;
import com.GhostSanket14.CollegeActivityportfolio.Model.AdminLoginData;
import com.GhostSanket14.CollegeActivityportfolio.Model.StudentLoginData;
import com.GhostSanket14.CollegeActivityportfolio.Service.AdminLoginDataService;

@RestController
@RequestMapping("/admin")
public class AdminLogin {

	@Autowired
	AdminLoginDataService adminLoginDataService;
	
	// http://localhost:8080/adminLogin?id=__&password=___    <- This is how we pass URL.
	@GetMapping("/adminLogin")
	public boolean adminLogin(@RequestParam("id") int id, @RequestParam("password") String password) {
		return adminLoginDataService.verifyLogin(id, password);
	}
	
	// This is where we will fill the Login verification data of the admin.
	@PostMapping("/adminLoginData")
	public AdminLoginData adminLoginData(@RequestBody AdmniLoginDataDTO alDTO) {
		return adminLoginDataService.createAdmin(alDTO.to());
	}
	
	// This is where we will fill the Login verification data of the student.
	@PostMapping("/studentLoginData")
	public StudentLoginData studentLoginData(@RequestBody StudentLoginDataDTO atdDTO) {
		return adminLoginDataService.createStudent(atdDTO.to());
	}
	
}