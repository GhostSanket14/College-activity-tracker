package com.GhostSanket14.CollegeActivityportfolio.DTO;

import com.GhostSanket14.CollegeActivityportfolio.Model.AdminLoginData;

import io.micrometer.common.lang.NonNull;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AdmniLoginDataDTO {

	String name;
	String position;
	@NotBlank
	String password;
	
	
	public AdminLoginData to(){
		return AdminLoginData.builder()
				.name(this.name)
				.position(this.position)
				.passwordAdmin(this.password)
				.build();
	}
}