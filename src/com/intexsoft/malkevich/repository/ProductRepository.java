package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intexsoft.malkevich.model.Product;
/**
 * Interface for generic CRUD operations on a repository of a {@link Product}
 * type
 */
public interface ProductRepository extends JpaRepository<Product, Long> {

}
