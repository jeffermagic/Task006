package com.controllers;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.query.criteria.internal.expression.function.AggregationFunction.LEAST;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.dao.Empdao;
import com.entities.Emp;
import com.services.Empservices;
import com.servicesImpl.EmpServicesImpl;





@Controller
@RequestMapping (value="emp")

public class UserController {
@Autowired
private Empservices empServices;
@Autowired
Empdao empdao;


	@RequestMapping (value="/page", method =RequestMethod.GET)
	public ModelAndView getPage() {
		ModelAndView view = new ModelAndView("hello");
		return view;
	
		
	}
	
	
	@RequestMapping(value="/saveOrUpdate", method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> getSaved(Emp emp){
		Map<String,Object> map = new HashMap <String,Object>();
		
		
		if(empServices.saveOrUpdate(emp)) {
			map.put("status","200");
			map.put("message","Your record have been saved successfully");
		}
		return map;
	}
	
	
	@RequestMapping (value="/list", method =RequestMethod.POST)
	public @ResponseBody Map<String,Object> getAll (Emp emp){
		Map<String,Object> map= new HashMap <String,Object>();
		
	 List<Emp> list1 =empServices.List();
		
		if (list1!=null) 
		{
			map.put ("status","200");
			map.put("message", "Data found");
			map.put("data",list1);
		}else {
			map.put("status","404");
			map.put("message","Data not found");
		}
		return map;
	}
	
	@RequestMapping(value="/delete",method=RequestMethod.POST)
	public @ResponseBody Map<String,Object> delete(Emp emp){
		Map<String,Object> map= new HashMap <String,Object>();
		
		if(empServices.delete(emp)) {
			map.put ("status","200");
			map.put	("message","Your record have been deleted successfully");
		}
		return map;
		}
	}
	



