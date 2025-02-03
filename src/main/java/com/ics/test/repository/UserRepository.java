package com.ics.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ics.test.entity.User;

/**
 * user repository
 * 
 * @author Vyom Gangwar
 * @Since 29-jan-2025
 * 
 **/
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
