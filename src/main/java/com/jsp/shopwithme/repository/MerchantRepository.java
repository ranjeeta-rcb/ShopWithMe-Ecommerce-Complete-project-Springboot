package com.jsp.shopwithme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopwithme.entity.Merchant;

public interface MerchantRepository extends JpaRepository<Merchant, Long>{

}
