package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intexsoft.malkevich.model.ProductCategory;

/**
 * Interface for generic CRUD operations on a repository of a {@link ProductCategory}
 * type
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long> {

}
