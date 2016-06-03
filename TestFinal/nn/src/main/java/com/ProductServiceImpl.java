package com;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.annotation.Propagation;  

@Service("ProductService") 
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true) 

public class ProductServiceImpl implements ProductService {
	
	@Autowired  
	 private ProductDAO productDao;  
	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)  
	public void addProduct(Product product) {
		// TODO Auto-generated method stub
		
		productDao.addProduct(product);

	}
	
	public List<Product> listProducts() {
		// TODO Auto-generated method stub
		return productDao.listProducts();
	}

	public Product getProduct(int id) {
		
		 return productDao.getProduct(id);  
		}

	public void deleteProduct(Product mobile) {
		productDao.deleteProduct(mobile);

	}

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)  
	@Override
	public void addRegister(Register r) 
	{
		productDao.addRegister(r);
		
	}
	
	public void updateProduct(Product p) {
		productDao.updateProduct(p);
		
	}

	@Override
	public List<Product> getList1(int id) {
		return productDao.getList1(id);
	}


}
