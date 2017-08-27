package com.online.dto;

import java.util.Date;
import java.util.Set;



import com.online.model.Account;

public class BranchDTO {

	private int id;
	private String name;
	private String city;
    private Date date;
	private String state;
	private Set<Account> listOfAccounts;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Set<Account> getListOfAccounts() {
		return listOfAccounts;
	}

	public void setListOfAccounts(Set<Account> listOfAccounts) {
		this.listOfAccounts = listOfAccounts;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	
	
}

	

