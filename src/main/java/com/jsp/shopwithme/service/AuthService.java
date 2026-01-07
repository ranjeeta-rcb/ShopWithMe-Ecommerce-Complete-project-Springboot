package com.jsp.shopwithme.service;

import java.util.Map;

import com.jsp.shopwithme.dto.MerchantDto;

public interface AuthService {

	Map<String, Object> login(String email, String password);

	Map<String, Object> viewUser(String email);

	Map<String, Object> updatePassword(String email, String oldPassword, String newPassword);

	Map<String, Object> registerMerchant(MerchantDto merchantDto);

	 

}
