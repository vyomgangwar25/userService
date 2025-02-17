package com.ics.test.entity;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class User extends CommonEntity {
	private String firstName;
	private String lastName;
	private String email;
	private String departmentId;

}
