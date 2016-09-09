package com.niit.controller;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.controller.*;


@Controller
public class UserController {
	 @Autowired
	 UserService userService;
		@Autowired
		  ServletContext req;
	  
	  @RequestMapping(value="/saveUser", method=RequestMethod.POST)
	  public ModelAndView saveUser(@Valid @ModelAttribute("userData") UserLogin reg,BindingResult result)
	  {
		  System.out.println("inside save user");
		  if(result.hasErrors())
		  {
			  System.out.println("inside Error "+result);
			  return new ModelAndView("Register");  
		  }
		  else
		  {
			  /*String p=req.getRealPath("/");
			  String path=reg.getFilePath(p,req.getContextPath());
			  System.out.println(path);*/
			  userService.addUser(reg);
			  return new ModelAndView("Register");
		  }
		  //return "index";
	  }
	  
	  
		
	  @RequestMapping(value="/Register",method=RequestMethod.GET)
	  public ModelAndView register(@ModelAttribute("userData") UserLogin UserLoginBean, BindingResult result)
	  {
		  ModelAndView model=new ModelAndView("Register");
		  //UserLogin register=getUserObject();
		  model.addObject("userLogin", UserLoginBean);
		System.out.println("inside Register");
		  return model;
	  }
	  
	  
	  /*@RequestMapping(value = "/BlogAdd", method = RequestMethod.GET)
	   public ModelAndView addBlog(@ModelAttribute("command")Blog blogBean,BindingResult result)
	   {
			 System.out.println("$$$$$$$$$$$$$$$$$$$$");
			  
			  ModelAndView model=new ModelAndView("BlogAdd");
			  model.addObject("blog",blogBean);
			 // System.out.println("Hello1");
			  return model;
	       
	   }*/
	  
	  
	  
	  @ModelAttribute("userData")
	  public UserLogin getUserObject()
	  {
		  return new UserLogin();
	  }
	  
	  
	  @RequestMapping(value="/Logout", method = RequestMethod.GET)
	  public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	      Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	      if (auth != null){    
	          new SecurityContextLogoutHandler().logout(request, response, auth);
	      }
	      return "/";//You can redirect wherever you want, but generally it's a good practice to show login screen again.
	  }
}
