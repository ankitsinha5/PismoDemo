package com.user.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class OperationTypes {
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private int operationType_Id;
	@Column
	private String description;

	public OperationTypes(int operationType_Id2, Object object) {
		// TODO Auto-generated constructor stub
	}
	public int getOperationType_Id() {
		return operationType_Id;
	}
	public void setOperationType_Id(int operationType_Id) {
		this.operationType_Id = operationType_Id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
