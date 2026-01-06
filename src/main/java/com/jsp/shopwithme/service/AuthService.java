package com.jsp.shopwithme.service;

import java.util.Map;

import com.jsp.shopwithme.dto.LoginDto;

public interface AuthService {

	Map<String, Object> login(LoginDto loginDto);

}
