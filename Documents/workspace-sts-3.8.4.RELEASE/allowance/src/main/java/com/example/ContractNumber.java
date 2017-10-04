package com.example;

import org.springframework.util.StringUtils;

public class ContractNumber {

	private String contractId;

	public void validateContractId() {

		if ( StringUtils.isEmpty( contractId ) )

		{
			throw new ContractIdInvalidException();
		}
	}

}
