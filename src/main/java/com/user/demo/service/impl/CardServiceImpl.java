package com.user.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.user.demo.converter.AccountConverter;
import com.user.demo.converter.TransactionsConverter;
import com.user.demo.dto.Accountdto;
import com.user.demo.dto.TransactionDto;
import com.user.demo.repository.AccountRepository;
import com.user.demo.repository.TransactionRepository;
import com.user.demo.service.CardService;

@Service
public class CardServiceImpl implements CardService{

	@Autowired
	AccountRepository accountRepository;
	@Autowired
	TransactionRepository transactionRepository;
	
	@Override
	public void createAccount(Accountdto accountDto) {
		accountRepository.save(AccountConverter.dtoToEntity(accountDto));
		
	}

	@Override
	public Accountdto getAccountByID(Integer accountID) {
		return AccountConverter.entityToDto(accountRepository.getOne(accountID));
	}

	@Override
	public void createTransaction(TransactionDto transactionDto) {
		transactionRepository.save(TransactionsConverter.dtoToEntity(transactionDto));
		
	}

	
}
