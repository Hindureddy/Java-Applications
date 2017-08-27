package com.online.controller;

import java.util.Date;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.constants.OnlineRestUris;
import com.online.dao.CustomerAccountDAO;
import com.online.model.Account;
import com.online.service.UserService;


@RestController
public class CreateCustomerAccountController {

	/*@Resource(name = "userService")
	 private UserService userService ;*/
	 
	@Resource(name = "accountDAO")
	 private CustomerAccountDAO  accountDAO ;
	
	@PostMapping(OnlineRestUris.CREATE_CUSTOMER_ACCOUNT)
	public Account createCustomer(@RequestBody Account account){
		//System.out.println("creating customer account");
				accountDAO.createCustomer(account);
		
		return account;
	}
}
