package com.cg.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Orders;

public interface IOrderDao extends JpaRepository<Orders,String>{

	
}
