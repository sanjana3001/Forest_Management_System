package com.cg.fms;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.cg.fms.dto.Customer;
import com.cg.fms.service.CustomerServiceImpl;
@SpringBootTest
public class testClass {
	@Autowired 
	CustomerServiceImpl customerService;
	@Test
	void testserviceGetCustomerById2( ) {
		Customer c=new Customer("101","password","name","email@gmail.com","address","town","code","contact");
		Customer test=customerService.serviceGetCustomer("101").get();
		assertNotEquals("name3",test.getCustomerName());
	}
	

}
