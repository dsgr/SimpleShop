package com.intexsoft.malkevich.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;

@RestController
@RequestMapping("/customer4")
public class CustomerController4 {
	@Autowired
	CustomerServiceImpl cs;

	/**
	 * Get all customers
	 */
	@RequestMapping("/all")
	public List<Customer> getAll() {
		return cs.findAll();
	}

	/**
	 * Add customer to db
	 */
	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public ResponseEntity<Customer> update(@RequestBody Customer customer) {
		cs.save(customer);
		return new ResponseEntity<Customer>(customer, HttpStatus.OK);
	}

}
