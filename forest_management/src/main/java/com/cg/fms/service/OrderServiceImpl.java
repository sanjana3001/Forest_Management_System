package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.IOrderDao;
import com.cg.fms.dto.Orders;
@Service
public class OrderServiceImpl implements OrderService {

	@Autowired
	IOrderDao odao;
	
	@Override
	public Orders getOrder(String orderNumber) {
		return odao.findById(orderNumber).get();
	}

	@Override
	public Orders addOrder(Orders order) {
		
		return odao.save(order);
	}

	@Override
	public Orders updateOrder(Orders order) {
		// TODO Auto-generated method stub
		return odao.save(order);
	}

	@Override
	public void deleteOrder(String orderNumber) {
		odao.deleteById(orderNumber);
	}

	@Override
	public List<Orders> getAllOrders() {
		// TODO Auto-generated method stub
		return odao.findAll();
	}

}
