package com.roshan.empl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.roshan.empl.dao.AddDao;
import com.roshan.empl.entity.AddEmployee;

@Controller
public class HomeController {
  
	@Autowired
	AddEmployee add;
	
	@Autowired
	AddDao adao;
	
	@RequestMapping("/home")
	public String home() {
		
		return "index.jsp";
	}

   @RequestMapping("/addemployee")
	public String add()
	 {
		
		return "addemployee.jsp";
	}
	  
   

  
   @RequestMapping(value= "/addEmployee" , method=RequestMethod.POST)
	 public String addEmployee(@RequestParam("firstname")String firstname,@RequestParam("lastname")String lastname,@RequestParam("email")String email,@RequestParam("address")String address ,@RequestParam("age")int age,@RequestParam("phone")String phone)
     
	 {
    
	add = new AddEmployee(firstname,lastname,email,address,age,phone);
	adao.addEmployee(add);
	return "index.jsp" ;
	
     }
   
   
	 }
