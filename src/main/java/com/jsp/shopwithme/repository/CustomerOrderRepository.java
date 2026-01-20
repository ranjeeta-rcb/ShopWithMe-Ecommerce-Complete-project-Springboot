package com.jsp.shopwithme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopwithme.entity.CustomerOrder;

public interface CustomerOrderRepository extends JpaRepository<CustomerOrder, Long> {

}
