package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intexsoft.malkevich.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
