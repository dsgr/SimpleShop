package com.intexsoft.malkevich.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer")
public class CustomerController {
	
	
	@RequestMapping("/all")
	public String getAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CustomerServiceImpl cs = context.getBean(CustomerServiceImpl.class);
		
		String result="";
		for (Customer c : cs.findAll()){
    		result = result + c.toString();
    	}
				
		return result;
	}
	
}
