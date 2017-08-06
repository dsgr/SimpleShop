package com.intexsoft.malkevich.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.repository.CustomerRepository;
import com.intexsoft.malkevich.service.CustomerService;

@Service
public class CustomerServiceImpl extends AbstractEntityServiceImpl<Customer> implements CustomerService {
	@Autowired
	CustomerRepository repository;

	public Customer findByEmail(String email) {
		if (email != null) {
			return repository.findByEmail(email);
		}
		return null;
	}

}
