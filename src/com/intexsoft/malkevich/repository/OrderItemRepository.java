package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.intexsoft.malkevich.model.OrderItem;

/**
 * Interface for generic CRUD operations on a repository of a {@link OrderItem}
 * type
 */
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
