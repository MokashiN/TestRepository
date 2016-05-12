package com;

import java.util.List;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	
	SessionFactory sessionFactory;
	 @Transactional(propagation = Propagation.REQUIRED, readOnly = false) 
	public void addProduct(Product prod) {
		
		sessionFactory.getCurrentSession().saveOrUpdate(prod);
		
		System.out.println("from ProductDaoImpl");
	

	}
	 @SuppressWarnings("unchecked") 
	public List<Product> listProducts() {
		// return (List<MobileProduct>) sessionFactory.getCurrentSession().createCriteria(MobileProduct.class).list(); 
		 System.out.println("in session");
	return	(List<Product>) sessionFactory.openSession().createQuery("from Product").list();
	}

	 public Product getProduct(int id) {
			Session session = this.sessionFactory.openSession();      
	        Product p = (Product) session.load(Product.class, new Integer(id));
	        
	        return p;  
		}
	public void deleteProduct(Product prod) {
		sessionFactory.openSession().createQuery("DELETE FROM Product WHERE id = "+prod.getId()).executeUpdate();
		

	}
	@Override
	public void addRegister(Register r)
	{
		sessionFactory.getCurrentSession().saveOrUpdate(r);
		System.out.println("from ProductDaoImpl");
		
	}
	@Transactional
	public void updateProduct(Product p) {
		Session session = sessionFactory.openSession();  
		  Transaction tx = session.beginTransaction();  
		  session.saveOrUpdate(p);  
		  tx.commit();  
		//  Serializable id = session.getIdentifier(employee);  
		  session.close();  
	}

}
