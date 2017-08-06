package com.intexsoft.malkevich.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "orders")
public class Order extends AbstractEntity{
	private static final long serialVersionUID = 5032212642150970940L;
	@Column
	@Temporal(TemporalType.DATE)
	public Date date;
	@ManyToOne(fetch = FetchType.EAGER)
	@JsonBackReference
	@JoinColumn(name = "customer_id")
	public Customer customer;
	@Column(name="is_done")
	public Boolean isDone;
}
