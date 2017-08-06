package com.intexsoft.malkevich.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intexsoft.malkevich.model.Order;
import com.intexsoft.malkevich.repository.OrderRepository;
import com.intexsoft.malkevich.service.OrderService;

@Service
public class OrderServiceImpl extends AbstractEntityServiceImpl<Order> implements OrderService {
	@Autowired
	OrderRepository repository;
}
