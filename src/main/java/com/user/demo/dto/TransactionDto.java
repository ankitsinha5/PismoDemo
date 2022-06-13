package com.user.demo.dto;

import java.util.Date;


public class TransactionDto {
	 int transaction_Id;
	
	 int account_ID;
	
	 int operationType_Id;
	
	 float amount;
	
	 Date eventDate;
	 
	 float balance;

	public TransactionDto(int transaction_Id2, int account_ID2) {
		// TODO Auto-generated constructor stub
	}

	public TransactionDto(int accountID) {
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

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

}
