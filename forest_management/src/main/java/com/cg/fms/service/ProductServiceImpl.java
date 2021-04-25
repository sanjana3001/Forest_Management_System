package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.fms.dao.IProductDao;
import com.cg.fms.dto.Product;
@Service
public class ProductServiceImpl implements ProductService

	{
		@Autowired
		IProductDao pdao;
		@Override
		public Product serviceGetProduct(int productId) {
			return pdao.findById(productId).get();
		}
		
		@Override
		public boolean serviceAddProduct(Product product) {
			pdao.save(product);
			return false;
		}
		

		@Override
		public boolean serviceUpdateProduct(Product product) {
			pdao.save(product);
			return false;
		}

		@Override
		public boolean serviceDeleteProduct(int productId) {
			pdao.deleteById(productId);
			return false;
		}

		@Override
		public List<Product> serviceGetAllProducts() {
			
			return pdao.findAll() ;
		}

		

	
}
