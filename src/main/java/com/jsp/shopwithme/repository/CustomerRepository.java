package com.jsp.shopwithme.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopwithme.entity.Customer;
import com.jsp.shopwithme.entity.User;

public interface CustomerRepository extends JpaRepository<Customer, Long> {

	Optional<Customer> findByUser(User user);
}