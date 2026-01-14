package com.jsp.shopwithme.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopwithme.entity.Merchant;
import com.jsp.shopwithme.entity.User;

public interface MerchantRepository extends JpaRepository<Merchant, Long>{

	Optional<Merchant> findByUser(User user);
}
