package com.promineotech.socialMediaApiHw.repository;

import org.springframework.data.repository.CrudRepository;

import com.promineotech.socialMediaApiHw.entity.User;

public interface UserRepository extends CrudRepository<User, Long>{

	public User findByUsername(String username);
	
}
