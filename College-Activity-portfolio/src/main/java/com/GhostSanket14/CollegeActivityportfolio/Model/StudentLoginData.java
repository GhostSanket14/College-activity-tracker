package com.GhostSanket14.CollegeActivityportfolio.Model;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class StudentLoginData {
// This REPO contains only PRN and PASSWORD. This is stored at Admin side and not at student side.
	@Id
	int studentPrn;
	String studentPass;
	@CreationTimestamp
	Date studentLoginCreatedDate;
	@UpdateTimestamp
	Date studentLoginUpdatedDate;
}