package com.online.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

//import com.fasterxml.jackson.annotation.JsonBackReference;


@Entity
@Table(name = "ACCOUNT")
public class Account {
	/* Account ID */
	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue
    private int id; 
	
	/* Account Number */
	@Column(name = "ACCOUNT_NUMBER", nullable = false)
	private String accountNumber;
	
	/* Available Balance */
	@Column(name = "BALANCE")
	private Long balance; 
	

	/* Account Created Date */
    @Column(name = "CREATED_DATE")
    @Temporal(value = TemporalType.TIMESTAMP)
	private Date createdDate; 
    
     /* Account Modified Date */
    
	@Column(name = "MODIFIED_DATE")
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date modifiedDate; 
	

	@ManyToOne
	@JoinColumn(name = "BRANCH_ID", referencedColumnName = "ID")
	private Branch branch;
	
	/* Current Type/ saving Account */
	@ManyToOne
	@JoinColumn(name = "AC_TYPE_ID", referencedColumnName = "ID")
	private AccountType type; 
	
	@ManyToMany(cascade = CascadeType.ALL) // Cascade  default value is none, the  Cascade values are save, update,save-update,delete, all
	@JoinTable(name = "CUSTOMER_ACCOUNT",  joinColumns = {
			@JoinColumn(name = "ID", nullable = false, updatable = false) },
			inverseJoinColumns = { @JoinColumn(name = "CUSTOMER_ID",
					nullable = false, updatable = false) })
	// @JsonBackReference
	private Set<Customer> customers;
	
	

	
	public Set<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(Set<Customer> customers) {
		this.customers = customers;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	public Long getBalance() {
		return balance;
	}

	public void setBalance(Long balance) {
		this.balance = balance;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

	public AccountType getType() {
		return type;
	}

	public void setType(AccountType type) {
		this.type = type;
	}
  
	

}
