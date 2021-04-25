package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Contract;



public interface ContractDao extends JpaRepository<Contract,String>{

}


