package org.jboss.tools.examples.controller;

import java.util.Date;

import javax.ejb.Stateless;
import javax.inject.Named;

@Stateless
@Named
public class CurrentDateProducer {
	public Date getCurrentDate() {
		return new Date();
	}
}
