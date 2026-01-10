package com.jsp.shopwithme;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ShopwithmeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ShopwithmeApplication.class, args);
	}

}
