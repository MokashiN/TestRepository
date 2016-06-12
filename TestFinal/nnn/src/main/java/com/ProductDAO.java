package com;

import java.util.*;



	public interface ProductDAO  {  
		   
		 public void addProduct(Product product);  
		  
		 public List<Product> listProducts();  
		   
		 public Product getProduct(int empid);  
		   
		 public void deleteProduct(Product employee);
		 
		 public void addRegister(Register r);
		 public void updateProduct(Product p);
		 public List<Product> getList1(int id);
		 
		}  
	
	

