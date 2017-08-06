package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intexsoft.malkevich.model.ProductCategory;


public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
