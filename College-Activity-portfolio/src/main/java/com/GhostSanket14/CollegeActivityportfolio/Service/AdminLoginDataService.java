package com.GhostSanket14.CollegeActivityportfolio.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.GhostSanket14.CollegeActivityportfolio.Model.AdminLoginData;
import com.GhostSanket14.CollegeActivityportfolio.Model.StudentLoginData;
import com.GhostSanket14.CollegeActivityportfolio.Repository.AdminRepo;
import com.GhostSanket14.CollegeActivityportfolio.Repository.StudentAdminLoginRepo;

@Service
public class AdminLoginDataService {

	@Autowired
	AdminRepo adminRepo;
	@Autowired
	StudentAdminLoginRepo studentAdminLoginRepo; 
	
	public AdminLoginData createAdmin(AdminLoginData adminLoginData) {
		return adminRepo.save(adminLoginData);
	}

	public boolean verifyLogin(int id, String password) {
		AdminLoginData ald=adminRepo.findById(id).orElse(null); // TIP- use 'orElse' after 'findById' this will give us 'object'
		if(id==ald.getId() && password.equals(ald.getPasswordAdmin())) { // and not 'Optional<object>'
			return true;
		}
		return false;
	
	}

	public StudentLoginData createStudent(StudentLoginData studentLoginData) {
		return studentAdminLoginRepo.save(studentLoginData);
	}

	// This will  verify if the student exists in the data given by admin. After this he will be directed to dashboard.
	// -1 will be returned for the user that dont exist.
	public StudentLoginData verify(int prnNo, int studPass) {
		StudentLoginData verifiedStud= studentAdminLoginRepo.findById(prnNo).orElse(null);
		if(prnNo==verifiedStud.getStudentPrn() && studPass==Integer.parseInt(verifiedStud.getStudentPass())) {
			return verifiedStud;
		}else {
			verifiedStud.setStudentPrn(-1);
			verifiedStud.setStudentPass("-1");
			return verifiedStud;
		}
	}
}