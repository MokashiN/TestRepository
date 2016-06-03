package com;

import java.util.List;

public interface ProductService  {  
	   
	 public void addProduct(Product product);  
	  
	 public List<Product> listProducts();  
	   
	 public Product getProduct(int id);  
	   
	 public void deleteProduct(Product product);

	public void addRegister(Register r);  
	
	public void updateProduct(Product p);
	
	List<Product> getList1(int id);
	
	} 

	
	
	

