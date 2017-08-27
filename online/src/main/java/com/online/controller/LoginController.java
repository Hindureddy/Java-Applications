package com.online.controller;


import javax.annotation.Resource;


import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.constants.OnlineRestUris;

import com.online.dto.UserDTO;
import com.online.model.User;
import com.online.service.UserService;



@RestController
public class LoginController {
	
	 @Resource(name = "userService")
	 private UserService userService ;
	 
	 @GetMapping(OnlineRestUris.GET_INFORMATION)
	 public String getInformation() {
		 
		 return "Welcome to Spring RestFull WebService";
	   
	 }
	 
	 @PostMapping(OnlineRestUris.SAVE_USER_INFORMATION)
	 public UserDTO saveUserData(@RequestBody UserDTO userDTO) {
		
		
		 UserDTO userDto = userService.login(userDTO);
		 
		 return userDto;
	   
	 }
	
	 @DeleteMapping(OnlineRestUris.DELETE_CUSTOMER)
		public String deleteCustomer(@PathVariable Long id) {
             System.out.println("Deleting the customer id");
             
             return "User got deleted";

		}

		@PutMapping(value= OnlineRestUris.DELETE_CUSTOMER, produces= MediaType.APPLICATION_JSON_VALUE)
		public String updateCustomer(@PathVariable Long id, @RequestBody User customer) {
			
			 return "updated the customer";
		}

			
}








