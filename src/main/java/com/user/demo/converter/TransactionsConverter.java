package com.user.demo.converter;

import com.user.demo.dto.Accountdto;
import com.user.demo.dto.TransactionDto;
import com.user.demo.entity.Account;
import com.user.demo.entity.Transactions;

public class TransactionsConverter {
	
	public static Transactions dtoToEntity(TransactionDto transactionDto) {
		Transactions transaction = new Transactions(transactionDto.getTransaction_Id(), null);
		/*
		 * account.setUserId(userDto.getUserId());
		 * account.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::
		 * dtoToEntity).collect(Collectors.toList()));
		 */
		return transaction;
	}
	
	public static TransactionDto entityToDto(Transactions transaction) {
		TransactionDto transactionDto = new TransactionDto(transaction.getTransaction_Id(), transaction.getAccount_ID());
	//	userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return transactionDto;
	}

}
