package com.programcreek.helloworld.controller;
 
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.programcreek.helloworld.CategoryVO.CategoryDaoImpl;
 
@Controller
public class HelloController {
	String message = "Welcome to Spring MVC!";
	 @RequestMapping("/")  
	    public String showMessage() { 
	    	
	        System.out.println("from controller");
			return "index";  
	         
	    }  
	  
	    @RequestMapping("/Login")  
	    public String showLogin() { 
	    	
	        System.out.println("from Login");
			return "Login";  
	         
	    } 
	    
	    @RequestMapping("/Register")  
	    public String showRegister() { 
	    	
	        System.out.println("from register");
			return "Register";  
	         
	    } 
	    
	    @RequestMapping("/Contact")  
	    public String showContact() { 
	    	
	        System.out.println("from Contact");
			return "Contact";  
	         
	    } 
	    
	    @RequestMapping("/category1")  
	    public String showCategory1() { 
	    	
	        System.out.println("from page1");
			return "category1";  
	         
	    } 
	    
	    @RequestMapping("/category2")  
	    public String showCategory2() { 
	    	
	        System.out.println("from page2");
			return "category2";  
	         
	    } 
	    
	    @RequestMapping("/category3")  
	    public String showCategory3() { 
	    	
	        System.out.println("from page3");
			return "category3";  
	         
	    } 
	    
	    @RequestMapping("/ViewAll")  
	    public String showCategory4() { 
	    	
	        System.out.println("from page4");
			return "AllCategory";  
	         
	    } 
	    @RequestMapping("/CategoryDao")
	    @ResponseBody
	    public String showCategory()
	    { 
	    	System.out.println("controller101");
	    	CategoryDaoImpl c=new CategoryDaoImpl();
	        String message=c.createData();
			return message;
	    }
	    
	    @RequestMapping("/CategoryDao1")
	    @ResponseBody
	    public String showCategoryDao1()
	    { 
	    	System.out.println("controller102");
	    	CategoryDaoImpl c=new CategoryDaoImpl();
	        String message=c.createData1();
			return message;
	    }
	    
	    @RequestMapping("/CategoryDao2")
	    @ResponseBody
	    public String showCategoryDao2()
	    { 
	    	System.out.println("controller103");
	    	CategoryDaoImpl c=new CategoryDaoImpl();
	        String message=c.createData2();
			return message;
	    }
	    
	    	    
}