# ShopWithMe-Ecommerce-Complete-project-Springboot

Paths to check in postman
Day-4
1.Login - auth/login method:post need to send email and password , it will create Unique token
Day-5
2.View profile i.e me - auth/me method: GET, select Authorization and select berear token and enter the generated token and send
3.Update password: auth/password method:PATCH  need to send in body select raw-json send old and new password 
Day-6
4. Merchant registration: auth/merchant/register, method: post and select body and write the name,email,password,email,address,gstNo which are there in MerchantDto and send and in email send temp email which generates OTP , for temporwary storing the otp we used REDIS
Day-7
5.
