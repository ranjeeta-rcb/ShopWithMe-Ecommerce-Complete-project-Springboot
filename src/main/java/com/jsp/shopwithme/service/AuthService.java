package com.jsp.shopwithme.service;

import java.util.Map;

import com.jsp.shopwithme.dto.MerchantDto;
import com.jsp.shopwithme.dto.OtpDto;

import jakarta.validation.Valid;

public interface AuthService {

	Map<String, Object> login(String email, String password);

	Map<String, Object> viewUser(String email);

	Map<String, Object> updatePassword(String email, String oldPassword, String newPassword);

	Map<String, Object> registerMerchant(MerchantDto merchantDto);

	Map<String, Object> resendOtp(String email);

	Map<String, Object> verifyOtp(@Valid OtpDto dto);

	 

}
