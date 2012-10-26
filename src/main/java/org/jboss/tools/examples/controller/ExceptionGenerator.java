package org.jboss.tools.examples.controller;

import java.io.Serializable;
import java.util.Date;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Stateful
@Named
@SessionScoped
public class ExceptionGenerator implements Serializable {	
	
	private Date constructedAt;
	
	@PostConstruct
	public void init() {
		constructedAt = new Date();
		System.err.println("ExceptionGenerator @PostConstruct");
	}
	
	public void doIllegalStateException() {
		throw new IllegalStateException("Test Exception");
	}
	
	public Date getConstructedAt() {
		return constructedAt;
	}
}