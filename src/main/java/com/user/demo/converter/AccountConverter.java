package com.user.demo.converter;


import com.user.demo.dto.Accountdto;
import com.user.demo.entity.Account;

public class AccountConverter {
	
	public static Account dtoToEntity(Accountdto accountDto) {
		Account account = new Account(accountDto.getAccount_ID(), null);
		/*
		 * account.setUserId(userDto.getUserId());
		 * account.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::
		 * dtoToEntity).collect(Collectors.toList()));
		 */
		return account;
	}
	
	public static Accountdto entityToDto(Account account) {
		Accountdto accountDto = new Accountdto(account.getAccount_ID(), account.getDocument_Number());
	//	userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return accountDto;
	}

}
