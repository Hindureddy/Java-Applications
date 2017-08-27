package com.online.controller;

import javax.annotation.Resource;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.online.constants.OnlineRestUris;
import com.online.model.Branch;
import com.online.service.BranchService;


@RestController
public class BranchController {

	@Resource(name="branchService")
	private BranchService branchService;
	
	@PostMapping(OnlineRestUris.CREATE_BRANCH)
	public Branch createBranch(@RequestBody Branch branch){
		
		Branch branches=branchService.createBranch(branch);
		
		//System.out.println("creating branch");
		return branches;
	}
}
