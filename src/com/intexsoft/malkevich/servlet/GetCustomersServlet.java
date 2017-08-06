package com.intexsoft.malkevich.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.intexsoft.malkevich.model.Customer;
import com.intexsoft.malkevich.service.impl.CustomerServiceImpl;

import ch.qos.logback.classic.Logger;

public class GetCustomersServlet extends HttpServlet {
	private static final long serialVersionUID = 8519671413542604293L;
	static final Logger LOG = (Logger) LoggerFactory.getLogger(GetCustomersServlet.class);

	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		LOG.debug("Starting doGet()...");
		PrintWriter out = resp.getWriter();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
		CustomerServiceImpl cs = context.getBean(CustomerServiceImpl.class);
		for (Customer customer : cs.findAll()) {
			out.println(customer.toString());
		}
		context.close();
	}
}
