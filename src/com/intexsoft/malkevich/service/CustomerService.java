package com.intexsoft.malkevich.service;

import com.intexsoft.malkevich.model.Customer;

public interface CustomerService extends AbstractEntityService<Customer> {
	Customer findByEmail(String email);
}
