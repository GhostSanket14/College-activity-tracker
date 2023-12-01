package com.GhostSanket14.CollegeActivityportfolio.DTO;

import com.GhostSanket14.CollegeActivityportfolio.Model.StudentLoginData;

import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
public class StudentLoginDataDTO {
	
	@NotBlank
	int studentPrn;
	@NotBlank
	String studentPass;
	
	public StudentLoginData to() {
		return StudentLoginData.builder()
				.studentPrn(this.studentPrn)
				.studentPass(this.studentPass)
				.build();
	}
}