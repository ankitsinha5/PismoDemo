package com.user.demo.dto;


public class OperationTypesDto {

	int operationType_Id;
	
	String description;

	public OperationTypesDto(int operationType_Id2, String description2) {
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
