package com.online.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.dao.UserDAO;
import com.online.dto.BranchDTO;
import com.online.dto.UserDTO;
import com.online.model.Branch;
import com.online.model.User;
import com.online.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService {

	@Resource(name = "userDao")
	private UserDAO userDao;

	@Override
	
	public UserDTO login(UserDTO userdto) {
		
		User user = new User();//using model class
		
		//getting data from dto and setting to model class
		
		user.setUserName(userdto.getUserName());
		user.setPassword(userdto.getPassword());
		
		
		userDao.createUser(user);//bussiness login to interact with db

		return userdto;

	}

	
}
