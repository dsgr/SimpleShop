package com.intexsoft.malkevich.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * Class for store ProductCategory entity
 */
@Entity
@Table(name = "product_categories")
public class ProductCategory extends AbstractEntity {
	private static final long serialVersionUID = -1921759133925406199L;
	@Column
	public String name;
	@Column
	public String description;

}
