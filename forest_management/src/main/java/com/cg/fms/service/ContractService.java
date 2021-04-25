package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import com.cg.fms.dto.Contract;



public interface ContractService {
	public Optional<Contract> getContract(String contractNumber);
	public Contract addContract(Contract contract);
	public Contract updateContract(Contract contract);
	public void deleteContract(String contractNumber);
	public List<Contract> getAllContracts();
}
