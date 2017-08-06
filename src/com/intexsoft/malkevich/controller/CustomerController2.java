package com.intexsoft.malkevich.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer2")
public class CustomerController2 {
	
	@RequestMapping("/all")
	public ResponseEntity<?> getAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CustomerServiceImpl cs = context.getBean(CustomerServiceImpl.class);
		List<Customer> customers = cs.findAll(); 
		return new ResponseEntity<List<Customer>>(customers, HttpStatus.OK);
	}
}
