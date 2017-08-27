package com.intexsoft.malkevich;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.model.Product;
import com.intexsoft.malkevich.model.ProductCategory;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;
import com.intexsoft.malkevich.service.impl.ProductCategoryServiceImpl;
import com.intexsoft.malkevich.service.impl.ProductServiceImpl;

import ch.qos.logback.classic.Logger;

public class Runner {
	static final Logger LOG = (Logger) LoggerFactory.getLogger(Runner.class);

	public static void main(String[] args) {
		LOG.debug("Starting main()...");
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
    	CustomerServiceImpl cs = context.getBean(CustomerServiceImpl.class);
    	
    	Customer customer1 = new Customer();
		customer1.email = "ivan@mail.by";
		customer1.name = "Ivan";
		cs.save(customer1);
    	
    	System.out.println(11 + cs.findByEmail("c2@tut.by").toString());
    	for (Customer c : cs.findAll()){
    		System.out.println(c.toString());
    	}
    	
    	
    	
    	
    	
    	/*
    	ProductServiceImpl ps = context.getBean(ProductServiceImpl.class);
    	ProductCategoryServiceImpl pcs = context.getBean(ProductCategoryServiceImpl.class);
    	Customer customer1 = new Customer();
		customer1.email = "c2@tut.by";
		customer1.name = "Sergey";
		cs.save(customer1);
		
		
		ProductCategory cat1 = new ProductCategory();
		cat1.name="Food";
		cat1.description="Food category description";
		pcs.save(cat1);
		Product pr1= new Product();
		pr1.category=cat1;
		pr1.name = "Bread";
		ps.save(pr1);
		context.close();
		*/
	}
}
