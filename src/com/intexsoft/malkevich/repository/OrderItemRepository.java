package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intexsoft.malkevich.model.OrderItem;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
