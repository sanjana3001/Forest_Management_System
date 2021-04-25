package com.cg.fms.controller;

	
	import java.util.List;
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
	import com.cg.fms.dto.Product;
	import com.cg.fms.service.ProductServiceImpl;
	@RestController   
	@RequestMapping("/product")
	public class ProductController
	{

		@Autowired
		ProductServiceImpl productService;
		
		public ProductServiceImpl getProductDAO()
		{
			return productService;
		}
		public void setProductDAO(ProductServiceImpl productService)
		{
			this.productService=productService;
			
		}
		@GetMapping(value="/all",produces="application/json")
		public  ResponseEntity<List<Product>> getProducts()
		{   System.out.println(72728);
			return new ResponseEntity<List<Product>> (productService.serviceGetAllProducts(),HttpStatus.OK);
		}
		
		@GetMapping(value="/{productId}",produces="application/json")
		public ResponseEntity<Product> getProduct(@PathVariable("productId")int productId)
		{ 
	    	return new ResponseEntity<Product>(productService.serviceGetProduct(productId),HttpStatus.OK);
		}

		
		@PostMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> addProduct(@RequestBody Product product)
		{
			productService.serviceUpdateProduct(product);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
			
		}
		
		@PutMapping(consumes="application/json")
		public ResponseEntity<HttpStatus> modifyProduct(@RequestBody Product product)
		{
			productService.serviceUpdateProduct(product);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);	
		}
		
		@DeleteMapping(value="/{productId}")
		public ResponseEntity<HttpStatus> deleteEmlpoyee(@PathVariable("productId")int productId)
		{
			productService.serviceDeleteProduct(productId);
			return new ResponseEntity<HttpStatus>(HttpStatus.OK);
		}
		

		

	}


