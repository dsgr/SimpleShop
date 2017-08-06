package com.intexsoft.malkevich.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intexsoft.malkevich.model.Product;
import com.intexsoft.malkevich.repository.ProductRepository;
import com.intexsoft.malkevich.service.ProductService;
@Service
public class ProductServiceImpl extends AbstractEntityServiceImpl<Product> implements ProductService {
	@Autowired
	ProductRepository repository;
}
