package com.cg.fms.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.fms.dto.Contract;
import com.cg.fms.dto.Customer;
import com.cg.fms.dto.Orders;
@Repository
public interface CustomerDao extends JpaRepository<Customer, String>{
	
    //Customer loginCustomer(String customerName, String customerPassword);
	List<Orders> getAllOrdersByCustomerId(String customerId);
	List<Contract> getAllContractsByCustomerId(String customerId);
}
