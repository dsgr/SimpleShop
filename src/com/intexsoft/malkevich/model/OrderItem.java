package com.intexsoft.malkevich.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Class for store OrderItem entity
 */
@Entity
@Table(name = "products_to_orders")
public class OrderItem extends AbstractEntity {
	private static final long serialVersionUID = -8003567327999170833L;
	@ManyToOne
	@JoinColumn(name = "prodct_id")
	Product product;
	@Column
	Long count;
	@ManyToOne
	@JoinColumn(name = "order_id")
	Order order;
}
