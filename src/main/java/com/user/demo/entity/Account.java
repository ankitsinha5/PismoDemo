package com.user.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Account {
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int account_ID;
	@Column
	private int document_Number;

	public Account(int account_ID2, Object object) {
		// TODO Auto-generated constructor stub
	}
	public int getAccount_ID() {
		return account_ID;
	}
	public void setAccount_ID(int account_ID) {
		this.account_ID = account_ID;
	}
	public int getDocument_Number() {
		return document_Number;
	}
	public void setDocument_Number(int document_Number) {
		this.document_Number = document_Number;
	}



}
