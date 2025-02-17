package com.ics.test.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

/**
 * 
 * @MappedSuperclass indicates that a class is a superclass and is not
 *                   associated with a specific database table, but its fields
 *                   (or properties) can be inherited by child entity classes
 *                   that are associated with tables.
 */
@MappedSuperclass
public class CommonEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
