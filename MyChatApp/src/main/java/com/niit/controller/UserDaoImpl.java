package com.niit.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.controller.*;


@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		// TODO Auto-generated constructor stub
	}
	 @Autowired
	 SessionFactory sessionFactory;
	 @Transactional
	 public List<UserLogin> getList() 
	 {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.openSession();  
			  @SuppressWarnings("unchecked")  
			  List<UserLogin> ProductList = session.createQuery("from UserLogin")  
			    .list();  
			  session.close();  
			  return ProductList;  
		}
	 
	 @Transactional
	 public void addUser(UserLogin p) 
	 {
		 			Session session=sessionFactory.openSession();
		     		System.out.println(p.getUname());
		     		
				//     System.out.println(p.getEmailid());
				     p.setFullname(p.getFullname());
				     System.out.println(p.getFullname());
				     p.setUname(p.getUname());
				     System.out.println(p.getUname());
				     p.setPassword(p.getPassword());
				     p.setRpassword(p.getRpassword());
				     p.setEmailid(p.getEmailid());
				     p.setPhone(p.getPhone());
				     p.setGender(p.getGender());
				     p.setDob(p.getDob());
				  //   p.setFpath(p.getFpath());
				     System.out.println(p.getDob());
			         session.saveOrUpdate(p);
			         
			         Users newUser = new Users();
			         newUser.setUsername(p.getUname());
			         newUser.setPassword(p.getPassword());
			         newUser.setEnabled(true);
			
			         UserRole newUserRole = new UserRole();
			         newUserRole.setUsername(p.getUname());
			         
			         newUserRole.setRole("ROLE_USER");
			         session.saveOrUpdate(newUser);
			         session.saveOrUpdate(newUserRole);
			         
				     System.out.println(p.getPassword());
			        // tx.commit();
				     session.flush();
			         session.close();
		}
	 	@Transactional
		public void deleteUser(int userid) {
			// TODO Auto-generated method stub
			
		}

		@Transactional
		public UserLogin getUserbyId(int userid) {
			// TODO Auto-generated method stub
			 Session session = sessionFactory.openSession();  
			 UserLogin prod = (UserLogin) session.load(UserLogin.class, userid);  
			  return prod;  
			
		}

		@Transactional
		public void updateUser(UserLogin p) {
			// TODO Auto-generated method stub
			Session session = sessionFactory.openSession();  
			  Transaction tx = session.beginTransaction();  
			  session.saveOrUpdate(p);  
			  tx.commit();  
			//  Serializable id = session.getIdentifier(employee);  
			  session.close();  
			
		}

}
