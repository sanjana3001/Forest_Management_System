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

import com.cg.fms.dto.Contract;
import com.cg.fms.dto.Customer;
import com.cg.fms.dto.Orders;
import com.cg.fms.exception.NoCustomerFoundException;
import com.cg.fms.service.CustomerService;
import com.cg.fms.service.CustomerServiceImpl;
@RestController   
@RequestMapping("/cust")

public class CustomerController {
	
		@Autowired
		CustomerServiceImpl customerService;

		public CustomerServiceImpl getCustomerDAO() {
			return customerService;
		}

		public void setCustomerDAO(CustomerServiceImpl customerService) {
			this.customerService = customerService;
		}
		
		@GetMapping(value="/all",produces="application/json")
		public  ResponseEntity<List<Customer>> getCustomers(){
			return new ResponseEntity<List<Customer>> (customerService.serviceGetAllCustomer(),HttpStatus.OK);
		}
		
		
		@GetMapping(value="/orders/{customerId}",produces="application/json")
		public  ResponseEntity<List<Orders>> getOrdersbyId(@PathVariable("customerId")String custId){
			Optional<Customer> cus=customerService.serviceGetCustomer(custId);
			if(cus.isPresent())
	    	return new ResponseEntity<List<Orders>>(customerService.getAllOrdersByCustomerId(custId),HttpStatus.OK);
			else 
				throw new NoCustomerFoundException("No Customer with id "+ custId);	
		}
		
		
		@GetMapping(value="/contract/{customerId}",produces="application/json")
		public  ResponseEntity<List<Contract>> getContractbyId(@PathVariable("customerId")String custId){
			Optional<Customer> cus=customerService.serviceGetCustomer(custId);
			if(cus.isPresent())
	    	return new ResponseEntity<List<Contract>>(customerService.getAllContractsByCustomerId(custId),HttpStatus.OK);
			else 
				throw new NoCustomerFoundException("No Customer with id "+ custId);	
		}
		
		
		
		@GetMapping(value="/{customerId}",produces="application/json")
		public ResponseEntity<Customer> getCustomer(@PathVariable("customerId")String custId){ 
			Optional<Customer> cus=customerService.serviceGetCustomer(custId);
			if(cus!=null)
	    	return new ResponseEntity<Customer>(customerService.serviceGetCustomer(custId).get(),HttpStatus.OK);
			else 
				throw new NoCustomerFoundException("No Customer with id "+ custId);
		}
		
		@GetMapping(value="/id/{customerId}/pass/{customerPassword}",produces="application/json")
		public ResponseEntity<Customer> dologinCustomer(@PathVariable("customerId")String custId, @PathVariable("customerPassword")String custPassword){ 
			Optional<Customer> cus=customerService.loginCustomer(custId, custPassword);
			
			if(cus==null)
				throw new NoCustomerFoundException("Invalid id/password "+ custId);
				
	    	
			else 
				return new ResponseEntity<Customer>(customerService.loginCustomer(custId, custPassword).get(),HttpStatus.OK);
		}
	
		
		@PostMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> addCustomer(@RequestBody Customer cus){
			customerService.serviceUpdateCustomer(cus);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			
		}
		
		@PutMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> modifyCustomer(@RequestBody Customer cus){
			customerService.serviceUpdateCustomer(cus);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);	
		}
		
		@DeleteMapping(value="/{customerId}")
		public ResponseEntity<HttpStatus> deleteEmlpoyee(@PathVariable("customerId")String customerId)
		{   Optional<Customer> cus=customerService.serviceGetCustomer(customerId);
		      if(cus.isPresent()) {
			 customerService.serviceDeleteCustomer(customerId);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		      }
		      else 
		    	  throw new NoCustomerFoundException("No Customer with id "+ customerId);
		}
		
		
}
