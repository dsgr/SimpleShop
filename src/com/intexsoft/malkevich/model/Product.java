package com.intexsoft.malkevich.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
/**
 * Class for store Product entity
 */
@Entity
@Table(name = "products")
public class Product extends AbstractEntity {
	private static final long serialVersionUID = 1858773909429951862L;
	@Column
	public String name;
	@Column
	public String description;
	@ManyToOne
	@JoinColumn(name="category_id")
	public ProductCategory category;
	@Column
	public Float price;
}
