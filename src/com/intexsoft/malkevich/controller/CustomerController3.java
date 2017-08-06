package com.intexsoft.malkevich.controller;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer3")
public class CustomerController3 {
	@RequestMapping("/all")
	public List<Customer> getAll() {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CustomerServiceImpl cs = context.getBean(CustomerServiceImpl.class);
		return cs.findAll();
	}
}
