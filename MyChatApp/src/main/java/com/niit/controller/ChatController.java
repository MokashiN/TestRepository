package com.niit.controller;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.apache.tomcat.util.net.jsse.openssl.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.controller.*;
import model.Message;
import model.OutputMessage;



@Controller

public class ChatController 
{
	
	@Autowired		
	 private ProductService productService;  

	@Autowired
	private ForumService fservice;	
	 
	 @Autowired
	BlogService service;
	 
	@RequestMapping("/")
	public String showIndex()
	{
		return "index";
	}
	
	@RequestMapping("/Login")
	public String showLogin()
	{
		return "Login";
	}
	
	
/*	 @RequestMapping("/")
		public String showIndex()
		{
			return "Login";
		}
	*/ 
	@RequestMapping("myPage")
	public String showMyPage()
	{
		return "index";
	}

	@RequestMapping("other")
	public String showOther()
	{
		return "headerUtility";
	}
	
	
	@RequestMapping("/Chat")
	public String viewApplication() {
		System.out.println("chat controller");
		return "ChatView";
	}

	@MessageMapping("/chat")
	@SendTo("/topic/message")
	public OutputMessage sendMessage(Message message) {
		return new OutputMessage(message, new Date());
	}
	
	@RequestMapping("AboutUs")
	public String showAboutUs()
	{
		return "about";
	}
	
/*	@RequestMapping(value = "/Register", method = RequestMethod.GET)  
	public ModelAndView saveRegister(@ModelAttribute("command")RegisterBean registerBean,   
	   BindingResult result) {  
		 Map<String, Object> model1 = new HashMap<String, Object>();
		 ModelAndView m=new ModelAndView();
		 m.addObject(registerBean);
	     System.out.println("hello1");
	     return m;
	 }

	@RequestMapping("/register1")
	public ModelAndView saveRegister1(@Valid RegisterBean registerBean, BindingResult result) 
	{
		  String returnVal = "RegisterUser";
		  ModelAndView model; 
		  System.out.println("!!!"+registerBean.password);
	        if(result.hasErrors())
	        {
	        	System.out.println("errors="+result);
	            returnVal = "Register";
	            model= new ModelAndView("RegisterUser");
	            System.out.println("returnVal="+returnVal);
	        }
	        else
	        {
	        	Register r=prepareRegister(registerBean);
	        	model= new ModelAndView("save");
	        	productService.addRegister(r);
	        }
	        return model;
	}*/
	
	
	
	
	@RequestMapping("/BlogView")
	public ModelAndView viewBlog() 
	{
		  System.out.println("in view all");
		  List<Blog> blogList = service.getList();
		  System.out.println("end view all");
		  System.out.println(blogList.size());
		  return new ModelAndView("BlogView", "blogList", blogList);  

	}  
	
	@RequestMapping("/admin/blogViewApprove")
	public ModelAndView viewBlogApprove() 
	{
		 // System.out.println("in view all");
		  List<Blog> blogList = service.getListApprove();
		 // System.out.println("end view all");
		  return new ModelAndView("BlogViewApprove", "blogList", blogList);  

	}  
		 
	 @RequestMapping(value = "/BlogAdd", method = RequestMethod.GET)
	   public ModelAndView addBlog(@ModelAttribute("command")Blog blogBean,BindingResult result)
	   {
			 System.out.println("$$$$$$$$$$$$$$$$$$$$");
			  
			  ModelAndView model=new ModelAndView("BlogAdd");
			  model.addObject("blog",blogBean);
			 // System.out.println("Hello1");
			  return model;
	       
	   }

	 @RequestMapping(value="/BlogSave",method=RequestMethod.POST)
	 
	  public ModelAndView saveBlog(@ModelAttribute("blog") Blog blogBean,BindingResult result) 
	  {
		  service.addBlog(blogBean);
		  return new ModelAndView("BlogAdd");
	  }
	 
	 @RequestMapping("/admin/delete")
	  public String deleteBlog(@RequestParam("blogid")int blogid)
	  {
		  service.deleteBlog(blogid);
		  return "deletePage1";
		  
	  }
	 
	 @RequestMapping("/admin/delete1")
	  public String deleteForum(@RequestParam("forumid")int forumid)
	  {
		  fservice.deleteForum(forumid);
		  return "deletePage1";
		  
	  }
	
	
	 @RequestMapping("/admin/blogApprove")  
	  public ModelAndView approveBlog(@RequestParam int blogid, @ModelAttribute Blog blog) {  
	   Blog blogObject =service.getBlogbyId(blogid);
	   return new ModelAndView("BlogApprove", "blog", blogObject);  
	  }  
	 
	 @RequestMapping("/admin/updateBlog")  
	  public ModelAndView updateBlog(@ModelAttribute("blog") Blog blog,BindingResult result) 
	  {  
		   service.approveBlog(blog); 
		  return new ModelAndView("redirect:BlogView");  

	 }
	 
	 @RequestMapping("/BlogViewRecord")
	  public ModelAndView getRecord(@RequestParam int blogid,@ModelAttribute Blog blog) { 
		 			System.out.println("Hello");
				   Blog blogObject =service.getBlogbyId(blogid); 
				   System.out.println("Hello");
				   System.out.println(blogObject.getBlogtitle());
				   return new ModelAndView("BlogViewRecord", "blogObject", blogObject);  
	 	} 

	 
	 @RequestMapping("/Forum")
		public String createBlog(HttpServletRequest request,Model model)
		{
			String name=request.getParameter("forum");
			model.addAttribute("name",name);
			System.out.println("In Forum Controller");
			return "Forum";
		}
		@ModelAttribute("forum")
		public Forum returnObject()
		{
			return new Forum();
		}
		@RequestMapping("/postF")
		public String postblog(@ModelAttribute("forum") Forum forum , Model model) throws IOException
		{
			System.out.println("I am in Forum");	
			//forum.setForumUserName("nilesh");
		/*	Authentication auth = SecurityContextHolder.getContext().getAuthentication();
			  if (!(auth instanceof AnonymousAuthenticationToken)) {
				UserDetails userDetail = (UserDetails) auth.getPrincipal();
				forum.setForumUserName(userDetail.getUsername());
			  }*/
			forum.setCreationdatetime(new java.util.Date());	
			fservice.createNewForum(forum);	
			return "Forum";
		}
		
		@SuppressWarnings("unchecked")
		@RequestMapping("/GsonCon1")
		public @ResponseBody String getValues() throws Exception
		{
			List<Forum> flist;
			String result="";
			flist = fservice.getForum();
			Gson gson = new Gson();
			result = gson.toJson(flist);
			System.out.println("before flist");
			System.out.println(flist);
			return result;
		}
		
		/*@RequestMapping("/ForumView")
		public ModelAndView getRecord(@RequestParam int forumid, @ModelAttribute Forum forum) 
		{
			
			/*  System.out.println("in view all");
			  List<Forum> blogList = service.getList();
			  System.out.println("end view all");
			  System.out.println(blogList.size());
			  return new ModelAndView("BlogView", "blogList", blogList);  

			Forum fObject = fservice.getForumbyId(forumid);
			System.out.println("Hello");
			return new ModelAndView("ForumView", "fObject", fObject);
		}*/
		
		@RequestMapping("/ForumView")
		public ModelAndView getRecord() 
		{
			
			  System.out.println("in view all");
			  List<Forum> forumList = fservice.getList();
			  System.out.println("end view all");
			  System.out.println(forumList.size());
			  return new ModelAndView("ForumView", "forumList", forumList);  

		
		}
		
		@RequestMapping("/ForumViewRecord")
		  public ModelAndView getForumRecord(@RequestParam int forumid,@ModelAttribute Forum forum) { 
			 			System.out.println("Hello");
					   Forum forumObject =fservice.getForumbyId(forumid); 
					   System.out.println("Hello");
					   System.out.println(forumObject.getForumtitle());
					   return new ModelAndView("ForumViewRecord", "forumObject", forumObject);  
		 	} 
		
		@RequestMapping("/Comment")
		public String viewComment() 
		{
			return "ViewComment";
		}
	 	
	private Register prepareRegister(RegisterBean registerBean)
	{  
		  Register r1= new Register();  
		  r1.setId(registerBean.getId());  
		  r1.setName(registerBean.getName());
		  r1.setSurname(registerBean.getSurname());
		  r1.setEmailid(registerBean.getEmailid());
		  r1.setReemailid(registerBean.getReemailid());
		  r1.setPassword(registerBean.getPassword());
		  r1.setCpassword(registerBean.getCpassword());
		  r1.setMobileno(registerBean.getMobileno());
		  registerBean.setId(null);
		  System.out.println("Prepare Register");
		  System.out.println(registerBean.getId());
		  System.out.println(registerBean.getName());
		  System.out.println(registerBean.getSurname());
		  System.out.println(registerBean.getEmailid());
		  System.out.println(registerBean.getReemailid());
		  System.out.println(registerBean.getPassword());
		  System.out.println(registerBean.getCpassword());
		  System.out.println(registerBean.getMobileno());
		  return r1;  
		 } 

}
