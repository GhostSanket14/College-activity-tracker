package com.GhostSanket14.CollegeActivityportfolio.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.GhostSanket14.CollegeActivityportfolio.Model.StudentLoginData;

@Repository
public interface StudentAdminLoginRepo extends JpaRepository<StudentLoginData, Integer> {
}