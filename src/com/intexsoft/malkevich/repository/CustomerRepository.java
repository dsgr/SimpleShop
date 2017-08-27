package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intexsoft.malkevich.model.Customer;

/**
 * Interface for generic CRUD operations on a repository of a {@link Customer}
 * type
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
	Customer findByName(String name);

	Customer findByEmail(String email);
}
