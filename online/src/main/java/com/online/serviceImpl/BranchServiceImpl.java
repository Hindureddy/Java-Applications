package com.online.serviceImpl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.online.dao.BranchDAO;
import com.online.dao.UserDAO;
import com.online.dto.BranchDTO;
import com.online.dto.UserDTO;
import com.online.model.Branch;
import com.online.model.User;
import com.online.service.BranchService;
 
@Service("branchService")
@Transactional
public class BranchServiceImpl implements BranchService{

	@Resource(name = "branchDao")
	private BranchDAO branchDao;

		
	@Override
	public Branch createBranch(Branch branch) {
			
		branchDao.createBranch(branch);
		return branch;
	}

}
