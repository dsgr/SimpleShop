package com.intexsoft.malkevich.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.intexsoft.malkevich.model.OrderItem;
import com.intexsoft.malkevich.repository.OrderItemRepository;
import com.intexsoft.malkevich.service.OrderItemService;
@Service
public class OrderItemServiceImpl extends AbstractEntityServiceImpl<OrderItem> implements OrderItemService {
	@Autowired
	OrderItemRepository repository;
}
