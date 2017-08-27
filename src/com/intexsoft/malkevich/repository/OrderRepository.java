package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intexsoft.malkevich.model.Order;

/**
 * Interface for generic CRUD operations on a repository of a {@link Order} type
 */
public interface OrderRepository extends JpaRepository<Order, Long> {

}
