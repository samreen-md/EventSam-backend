package com.eventsam.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.eventsam.backend.entity.User;

	public interface UserRepository extends JpaRepository<User, Long> {

	    User findByEmail(String email);
	}
