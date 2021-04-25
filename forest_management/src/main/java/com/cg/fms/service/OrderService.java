package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.fms.dto.Orders;

@Service
public interface OrderService {

	public Orders getOrder(String orderNumber);

	public Orders addOrder(Orders order);

	public Orders updateOrder(Orders order);

	public void deleteOrder(String orderNumber);
	
	public List<Orders> getAllOrders();
}
