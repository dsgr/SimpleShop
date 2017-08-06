package com.intexsoft.malkevich.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intexsoft.malkevich.model.ProductCategory;
import com.intexsoft.malkevich.repository.ProductCategoryRepository;
import com.intexsoft.malkevich.service.ProductCategoryService;

@Service
public class ProductCategoryServiceImpl extends AbstractEntityServiceImpl<ProductCategory>
		implements ProductCategoryService {
	@Autowired
	ProductCategoryRepository repository;

}
