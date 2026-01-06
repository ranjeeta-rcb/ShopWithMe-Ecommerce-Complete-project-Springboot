package com.jsp.shopwithme.dao;

import org.springframework.stereotype.Repository;

import com.jsp.shopwithme.entity.User;
import com.jsp.shopwithme.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {

	private final UserRepository userRepository;

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElseThrow();
	}

	public void save(User user) {
		userRepository.save(user);
	}
}
