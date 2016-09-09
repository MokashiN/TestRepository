package com.niit.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service("ProductService") 
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 

public class ProductServiceImpl implements ProductService 
{
	
	@Autowired  
	 private ProductDAO productDao;  

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)  
	@Override
	public void addRegister(Register r) 
	{
		productDao.addRegister(r);
		System.out.println("ProductServiceImpl");
	}

}
