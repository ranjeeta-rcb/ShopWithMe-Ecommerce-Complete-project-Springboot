package com.jsp.shopwithme.exception;

public class OutOfStockException extends RuntimeException{

	public OutOfStockException(String message) {
		super(message);
}
}