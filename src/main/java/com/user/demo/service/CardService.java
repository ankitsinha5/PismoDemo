package com.user.demo.service;

import com.user.demo.dto.Accountdto;
import com.user.demo.dto.TransactionDto;

public interface CardService {
	
	void createAccount(Accountdto account);
	Accountdto getAccountByID(Integer accountID);
	void createTransaction(TransactionDto transactionDto);

}
