package com.online.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name = "BRANCH")
public class Branch {
	
	@Id
	@Column(name ="ID", unique = true, nullable = false, length =10)
	private int id;
	
	@Column(name ="NAME", nullable = false)
	private String name;
	
	@Column(name ="CITY", nullable = false)
	private String city;
	
	@Column(name ="DATE")
    private Date date;
	
	@Column(name = "STATE")
	private String state;
	
	@OneToMany(mappedBy="branch", fetch = FetchType.LAZY)
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
