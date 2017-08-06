package com.intexsoft.malkevich.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer4")
public class CustomerController4 {
	@Autowired
	CustomerServiceImpl cs;
	
	@RequestMapping("/all")
	public List<Customer> getAll() {
		return cs.findAll();
	}
}
