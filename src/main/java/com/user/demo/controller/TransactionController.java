package com.user.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.user.demo.dto.TransactionDto;
import com.user.demo.service.CardService;

@RequestMapping("/transactions")
@RestController
public class TransactionController {
	
	@Autowired
	CardService cardService;
	
	@RequestMapping(value= "/createTransaction", method= RequestMethod.POST)
	public void saveAccount(@RequestBody TransactionDto transactionDto) {
		transactionDto.setBalance(transactionDto.getAmount());
		
		cardService.createTransaction(transactionDto);
	}

}
