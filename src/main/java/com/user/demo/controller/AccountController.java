package com.user.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.user.demo.dto.Accountdto;
import com.user.demo.service.CardService;

@RequestMapping("/accounts")
@RestController
public class AccountController {
	@Autowired
	CardService cardService;
	
	@RequestMapping(value= "/createAccount", method= RequestMethod.POST)
	public void saveAccount(@RequestBody Accountdto accountDto) {
		cardService.createAccount(accountDto);
	}
	
	@RequestMapping("/getAccount/{accountId}")
	public Accountdto getAccountById(@PathVariable Integer accountId) {
		return cardService.getAccountByID(accountId);
	}

}
