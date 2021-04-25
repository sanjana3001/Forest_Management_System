package com.cg.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.fms.dto.Product;

public interface IProductDao extends JpaRepository<Product,Integer>
	{
//		public Product getProduct(String productId);
//
//		public boolean addProduct(Product product);
//
//		public boolean updateProduct(Product product);
//
//		public boolean deleteProduct(String productId);
//		
//		public List<Product> getAllProducts();

	}
