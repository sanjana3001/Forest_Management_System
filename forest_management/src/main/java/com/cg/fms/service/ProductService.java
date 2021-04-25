package com.cg.fms.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.cg.fms.dto.Product;
@Service
public interface ProductService {
    public Product serviceGetProduct(int productId);
	
	public boolean serviceAddProduct(Product product);

	public boolean serviceUpdateProduct(Product product);

	public boolean serviceDeleteProduct(int productId);
	
	public List<Product> serviceGetAllProducts();

}
