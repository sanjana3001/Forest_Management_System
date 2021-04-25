package com.cg.fms.controller;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.fms.exception.NoDataFoundException;
import com.cg.fms.dto.Contract;

import com.cg.fms.service.ContractServiceImpl;
@RestController
@RequestMapping("/contract")
public class ContractController {
@Autowired
ContractServiceImpl contractService;

public ContractServiceImpl getContractService() {
	return contractService;
}

public void setContractService(ContractServiceImpl contractService) {
	this.contractService = contractService;
}

@GetMapping(value="/all",produces="application/json")
public ResponseEntity<List<Contract>> getAllContracts(){
	return new ResponseEntity<List<Contract>>(contractService.getAllContracts(),HttpStatus.OK);
}
@GetMapping(value="/{contractid}",produces="application/json")
public Optional<Contract> getContract(@PathVariable("contractid")String contractid){
	Optional<Contract> c= contractService.getContract(contractid);
	if(c.isPresent())
		return c;
	else 
		throw new NoDataFoundException("No Contract found with given Contract ID: "+ contractid);
	
}
@PostMapping(consumes="application/json")
public ResponseEntity<HttpStatus> addContract(@RequestBody Contract con) {
	contractService.addContract(con);
	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
}
@PutMapping(consumes="application/json")
public ResponseEntity<HttpStatus> updateContract(@RequestBody Contract con) {
	contractService.addContract(con);
	return new ResponseEntity<HttpStatus>(HttpStatus.OK);
}
@DeleteMapping(value="/{conid}")
public ResponseEntity<HttpStatus> deleteContract(@PathVariable("conid")String conid){
	Optional<Contract> c=contractService.getContract(conid);
	if(c.isPresent()) {
		contractService.deleteContract(conid);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
	else {
		throw new NoDataFoundException("No Contract found with given Contract ID: "+ conid+"Data can not be deleted ");
	}
}

}