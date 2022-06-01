package com.user.demo.converter;

import com.user.demo.dto.OperationTypesDto;
import com.user.demo.entity.OperationTypes;


public class OperationTypesConverter {
	
	public static OperationTypes dtoToEntity(OperationTypesDto operationTypesDto) {
		OperationTypes operationTypes = new OperationTypes(operationTypesDto.getOperationType_Id(), null);
		/*
		 * account.setUserId(userDto.getUserId());
		 * account.setSkills(userDto.getSkillDtos().stream().map(SkillConverter::
		 * dtoToEntity).collect(Collectors.toList()));
		 */
		return operationTypes;
	}
	
	public static OperationTypesDto entityToDto(OperationTypes operationTypes) {
		OperationTypesDto operationTypesDto = new OperationTypesDto(operationTypes.getOperationType_Id(), operationTypes.getDescription());
	//	userDto.setSkillDtos(user.getSkills().stream().map(SkillConverter::entityToDto).collect(Collectors.toList()));
		return operationTypesDto;
	}

}
