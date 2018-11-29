package com.roshan.empl;

import java.awt.List;
import java.util.ArrayList;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.roshan.empl.dao.AddDao;
import com.roshan.empl.entity.AddEmployee;


@Controller
public class SearchController {
	
	
	ArrayList<AddEmployee> employees= new ArrayList<AddEmployee>();
			
	@Autowired
	AddEmployee add;
	
	@Autowired
	AddDao adao;

	 @RequestMapping("/search")
		public String search()
		 {
			
			return "search.jsp";
		}
	 
	 @RequestMapping(value= "/searchEmployee" , method=RequestMethod.POST)
	 public void searchEmployee(@RequestParam("firstname") String firstname , Map<String, Object> map)
	 
	 {
		 add = new AddEmployee(firstname);
		employees = (ArrayList<AddEmployee>) adao.getAllEmployee(add);
		map.put("employees",employees);
	    map.put("emp", add);
	    }
	 
	 
	 
	   
	
}
