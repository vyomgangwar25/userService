package com.ics.test.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class DepartmentDTO {
	private Integer id;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
