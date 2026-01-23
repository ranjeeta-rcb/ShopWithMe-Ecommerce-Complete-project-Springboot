package com.jsp.shopwithme.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopwithme.entity.Customer;
import com.jsp.shopwithme.entity.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

	List<CustomerOrder> findByCustomer(Customer customer);
}
