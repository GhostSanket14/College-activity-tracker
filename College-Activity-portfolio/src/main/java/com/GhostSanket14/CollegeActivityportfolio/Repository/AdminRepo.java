package com.GhostSanket14.CollegeActivityportfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GhostSanket14.CollegeActivityportfolio.Model.AdminLoginData;

@Repository
public interface AdminRepo extends JpaRepository<AdminLoginData, Integer>{
}