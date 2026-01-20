package com.jsp.shopwithme.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.shopwithme.entity.Item;

public interface ItemRepository extends JpaRepository<Item, Long>{

}
