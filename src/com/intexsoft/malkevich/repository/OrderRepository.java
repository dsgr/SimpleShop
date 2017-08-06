package com.intexsoft.malkevich.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.intexsoft.malkevich.model.Order;


public interface OrderRepository extends JpaRepository<Order, Long> {

}
