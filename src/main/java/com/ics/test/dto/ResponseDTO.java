package com.ics.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class ResponseDTO {
	private DepartmentDTO departmentDTO;
	private UserDTO userDTO;

}
