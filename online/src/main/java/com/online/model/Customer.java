package com.online.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;



@Entity
@Table(name ="CUSTOMER")


public class Customer {
	
	@Id
	@Column(name = "CUSTOMER_ID")
	
	private int id;

	@Column(name = "DATE")
	private Date date;
	

	@Column(name = "NAME")
	private String name;
	
	@Column(name = "Password")
	private String password;
	
		@Column(name = "EmailId")
	private String emailid;
	
	@OneToMany(mappedBy="customer", cascade = CascadeType.ALL)
	private Set<Address> listOfAddress;

	
/*	@ManyToMany(mappedBy = "customers")
	 @JsonManagedReference
	private Set<Account> accounts;*/
	
	/*public Set<Account> getAccounts() {
		return accounts;
	}


	public void setAccounts(Set<Account> accounts) {
		this.accounts = accounts;
	}*/

	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getEmailid() {
		return emailid;
	}


	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

    public Set<Address> getListOfAddress() {
		return listOfAddress;
	}


	public void setListOfAddress(Set<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}


	public Date getDate() {
		return date;
	}


	public void setDate(Date date) {
		this.date = date;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

	

}
