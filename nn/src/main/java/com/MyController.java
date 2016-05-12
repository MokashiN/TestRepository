package com;
 
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class MyController {
	String message = "Welcome to Spring MVC!";
	
	@Autowired  
	 private ProductService productService;  
	@Autowired
	ServletContext req;
	@RequestMapping("/")
	public ModelAndView showMessage()
	 {
		System.out.println("in controller");
		ModelAndView mv = new ModelAndView("index");
		return mv;
	}
	
	@RequestMapping("/AboutUs")
	public String showAboutUs()
	 {
		System.out.println("in controller");
		return "aboutus";
	}
	
	@RequestMapping("/Login")
	public String showViewAll()
	 {
		System.out.println("in controller");
		return "Login";
	}
	
	@RequestMapping("/category4")
	public String showCategoryAmazone()
	 {
		System.out.println("in amazone");
		return "category4";
	}
	
	@RequestMapping("/category5")
	public String showCategoryFlipcart()
	 {
		System.out.println("in Flipcart");
		return "category5";
	}
	
	
/*	@RequestMapping(value="/register", method=RequestMethod.GET)
	public ModelAndView addRegister(@ModelAttribute("command")RegisterBean registerBean,  
    BindingResult result)
	{  
		System.out.println("in controller");
		ModelAndView m1=new ModelAndView();
		m1.addObject(m1);
		return m1;
	
	}*/
	
	@RequestMapping(value = "/register", method = RequestMethod.GET)  
	public ModelAndView saveRegister(@ModelAttribute("command")RegisterBean registerBean,   
	   BindingResult result) {  
		 Map<String, Object> model1 = new HashMap<String, Object>();
		 ModelAndView m=new ModelAndView();
		 m.addObject(registerBean);
	     System.out.println("hello1");
	     return m;
	 }
	
	
	@RequestMapping(value = "/add", method = RequestMethod.GET)  
	 public ModelAndView addProduct(@ModelAttribute("command")ProductBean productBean,  
	   BindingResult result) {  
	  Map<String, Object> model = new HashMap<String, Object>();  
	//  model.put("products",  prepareListofBean(productService.listProducts()));  
	  ModelAndView m=new ModelAndView();
	  m.addObject(productBean);
	 // return new ModelAndView("add", model);  
	  return m;
	 }  
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)  
	public ModelAndView saveEmployee(@ModelAttribute("command")ProductBean productBean,   
	   BindingResult result) {  
	Product product = prepareModel(productBean);  
	 
	System.out.println("#######"+productBean.getFile1());
	  String p=req.getRealPath("/");
	  System.out.println("hello1");
	  System.out.println("#####"+product.getFile1().getOriginalFilename());
	  String path=product.getFilePath(p, req.getContextPath());
	  System.out.println(path);
	  productService.addProduct(product);  
	  return new ModelAndView("save");  
	 }  
	
	/*@RequestMapping(value = "/register", method = RequestMethod.GET)  
	public ModelAndView saveRegister(@ModelAttribute("command")RegisterBean registerBean,   
	   BindingResult result) {  
		 Map<String, Object> model1 = new HashMap<String, Object>();
		 ModelAndView m=new ModelAndView();
		 m.addObject(registerBean);
	     System.out.println("hello1");
	     return m;
	 }*/
	
	/*
	 @RequestMapping(value = "/register1", method = RequestMethod.POST)  
	
	public ModelAndView saveEmployee(@ModelAttribute("command")RegisterBean registerBean,   
	   BindingResult result)
	 {  
	   Register r= prepareRegister(registerBean);  
	  productService.addRegister(r);  
	  return new ModelAndView("save");  
	 }
	*/
	
	
	@RequestMapping("/register1")
	public ModelAndView saveRegister1(@Valid RegisterBean registerBean, BindingResult result) 
	{
		  String returnVal = "register";
		  ModelAndView model; 
	        if(result.hasErrors())
	        {
	        	System.out.println("errors="+result);
	            returnVal = "register";
	            model= new ModelAndView("register");
	            System.out.println("returnVal="+returnVal);
	        }
	        else
	        {
	        	Register r=prepareRegister(registerBean);
	        	model= new ModelAndView("save");
	        	productService.addRegister(r);
	        }
	        return model;
	}
	
	/*@RequestMapping(value = "/register1", method = RequestMethod.POST)  
	public ModelAndView saveEmployee(@ModelAttribute("command")RegisterBean registerBean,   
	   BindingResult result) {  
	Register r= prepareRegister(registerBean);  
	 
	  productService.addRegister(r);  
	  return new ModelAndView("save");  
	 }  */
	
	
	
	
	    
	 @RequestMapping(value="/productlist", method = RequestMethod.GET)  
	 public ModelAndView listEmployees( Map<String, Object> model) {  
	  List<Product> lst=productService.listProducts(); 
	  
	  System.out.println(lst);
	  
	  return new ModelAndView("productlist","prdList", lst);  
	 } 
	 
	 @RequestMapping(value = "/delete", method = RequestMethod.GET)  
	 public ModelAndView editProduct(@ModelAttribute("command")ProductBean productBean,  
	    BindingResult result) {  
	   productService.deleteProduct(prepareModel(productBean));  
	   Map<String, Object> model = new HashMap<String, Object>();  
	   model.put("products", null);  
	   model.put("products",  prepareListofBean(productService.listProducts()));  
	   return new ModelAndView("productlist", model);  
	  }  
	
	 
	 @RequestMapping(value = "/edit", method = RequestMethod.GET)  
	 public ModelAndView deleteEmployee(@RequestParam int id,  
			    @ModelAttribute Product product) {  
		 Product productObject =productService.getProduct(id); 
		   System.out.println();
		   System.out.println("Edit:"+productObject.getName());
		   return new ModelAndView("editproduct", "productObject", productObject);  
		  }  
	
	 @RequestMapping("/update")  
	  public ModelAndView updateUser(@ModelAttribute Product product)
	 {  
		  System.out.println(""+product.getId());
	   productService.updateProduct(product);  
	   return new ModelAndView("save");  
	    
	   
	 }  
	
	/* private String saveDirectory = "D:/Training/TestJava/src/main/webapp/resource";
	 @RequestMapping(value = "/fileupload", method = RequestMethod.GET)
	    public String displayForm() {
	        return "fileupload";
	    }
	  
 	 @RequestMapping(value = "/save1", method = RequestMethod.POST)
	 public String save(
	 @ModelAttribute("uploadForm") FileUploadForm uploadForm,
	 Model m)throws Exception 
	 {
	  
		 System.out.println(m);
	     System.out.println(uploadForm);
	     List<MultipartFile> files = uploadForm.getFiles();
	     List<String> fileNames = new ArrayList<String>();
	  
	     if(null != files && files.size() > 0) 
	     {
	            for (MultipartFile multipartFile : files) 
	            {
	                String fileName = multipartFile.getOriginalFilename();
	                System.out.println(fileName);
	                fileNames.add(fileName);
	                //Handle file content - multipartFile.getInputStream()
	                try
	                {
	                		multipartFile.transferTo(new File(saveDirectory + multipartFile.getOriginalFilename()));
	                }
	                catch (IllegalStateException e) 
	                {
	                	e.printStackTrace();
	                } catch (IOException e) 
	                {
	                	e.printStackTrace();
	                }  
	            }
	      }
	         
	        m.addAttribute("files", fileNames);
	        System.out.println(m);
	        return "save1";
	    }

	 */
	 
	 @RequestMapping(value="/save1", method=RequestMethod.POST )
	   public @ResponseBody String multipleSave(@RequestParam("file") MultipartFile[] files){
	   
	String fileName = null;
	   
	String msg = "";
	   
	if (files != null && files.length >0) {
	   
	for(int i =0 ;i< files.length; i++){
	           try {
	               fileName = files[i].getOriginalFilename();
	               byte[] bytes = files[i].getBytes();
	               BufferedOutputStream buffStream = 
	                       new BufferedOutputStream(new FileOutputStream(new File("D:/Training/TestJava/src/main/webapp/resource/images" + fileName)));
	               buffStream.write(bytes);
	               buffStream.close();
	               msg += "You have successfully uploaded " + fileName +"<br/>";
	           } catch (Exception e) {
	               return "You failed to upload " + fileName + ": " + e.getMessage() +"<br/>";
	           }
	   
	}
	   
	return msg;
	       } else {
	           return "Unable to upload. File is empty.";
	       }
	   }
	private Product prepareModel(ProductBean productBean){  
		  Product prod = new Product();  
		  prod.setId(productBean.getId());  
		  prod.setName(productBean.getName());  
		  prod.setPrice(productBean.getPrice());  
		  prod.setFile1(productBean.getFile1());
		  productBean.setId(null);  
		  return prod;  
		 }  

	private Register prepareRegister(RegisterBean registerBean){  
		  Register r1= new Register();  
		  r1.setId(registerBean.getId());  
		  r1.setName(registerBean.getName());
		  r1.setCity(registerBean.getCity());
		  r1.setEmail(registerBean.getEmail());
		  r1.setMobileno(registerBean.getMobileno());
		  registerBean.setId(null);  
		  return r1;  
		 }  

	
	private List<ProductBean> prepareListofBean(List<Product> products){  
		  List<ProductBean> beans = null;  
		  if(products != null && !products.isEmpty()){  
		   beans = new ArrayList<ProductBean>();  
		   ProductBean bean = null;  
		   for(Product product : products){  
		    bean = new ProductBean();  
		    bean.setId(product.getId());  
		    bean.setName(product.getName());  
		    bean.setPrice(product.getPrice());  
		   
		    beans.add(bean);  
		   }  
		  }  
		  return beans;  
		 }
	
	private ProductBean prepareProductBean(Product product){  
		  ProductBean bean = new ProductBean();  
		  bean.setId(product.getId());  
		  bean.setName(product.getName());  
		  bean.setPrice(product.getPrice());  
		 
		  return bean;  
		 } 
}