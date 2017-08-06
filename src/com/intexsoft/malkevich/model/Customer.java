package com.intexsoft.malkevich.model;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "customers")
public class Customer extends AbstractEntity {
	private static final long serialVersionUID = 9053495817728437468L;
	@Column
	public String name;
	@Column
	public String address;
	@Column
	public String phone;
	@Column
	public String email;
	@Column @JsonIgnore
	public String password;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "customer")
	@JsonManagedReference
	public List<Order> orders;
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", phone=" + phone + ", email="
				+ email + ", password=" + password + "]";
	}

}
