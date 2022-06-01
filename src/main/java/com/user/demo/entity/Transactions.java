package com.user.demo.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transactions {

	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int transaction_Id;
	@Column
	private int account_ID;
	@Column
	private int operationType_Id;
	@Column
	private float amount;
	@Column
	private Date eventDate;
	
	public Transactions(int transaction_Id2, Object object) {
		// TODO Auto-generated constructor stub
	}
	public int getTransaction_Id() {
		return transaction_Id;
	}
	public void setTransaction_Id(int transaction_Id) {
		this.transaction_Id = transaction_Id;
	}
	public int getAccount_ID() {
		return account_ID;
	}
	public void setAccount_ID(int account_ID) {
		this.account_ID = account_ID;
	}
	public int getOperationType_Id() {
		return operationType_Id;
	}
	public void setOperationType_Id(int operationType_Id) {
		this.operationType_Id = operationType_Id;
	}
	public float getAmount() {
		return amount;
	}
	public void setAmount(float amount) {
		this.amount = amount;
	}
	public Date getEventDate() {
		return eventDate;
	}
	public void setEventDate(Date eventDate) {
		this.eventDate = eventDate;
	}
	
	
}
