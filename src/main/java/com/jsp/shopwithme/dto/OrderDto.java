package com.jsp.shopwithme.dto;

import java.util.List;

import com.jsp.shopwithme.entity.Item;

import lombok.Data;

@Data
public class OrderDto {
	private String address;
	private Double amount;
	private List<Item> items;
	private String paymentId;
	private String orderId;
}
