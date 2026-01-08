package com.jsp.shopwithme.dao;

import org.springframework.stereotype.Repository;

import com.jsp.shopwithme.entity.Merchant;
import com.jsp.shopwithme.entity.User;
import com.jsp.shopwithme.repository.MerchantRepository;
import com.jsp.shopwithme.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Repository
@RequiredArgsConstructor
public class UserDao {

	private final UserRepository userRepository;
	private final MerchantRepository merchantRepository;
	
	public boolean checkEmailAndMobieDuplicate(String email, Long mobile) {
		return userRepository.existsByEmailOrMobile(email, mobile);
	}
	

	public User findByEmail(String email) {
		return userRepository.findByEmail(email).orElseThrow();
	}

	public void save(User user) {
		userRepository.save(user);
	}
	
	public void save(Merchant merchant) {
		merchantRepository.save(merchant);
	}
	
}
