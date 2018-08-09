package com.pankaj.microservice.orderservice;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class OrderBean {
	@Id
	private int id;
private String orderName;
private int customerID;
public OrderBean() {
	// TODO Auto-generated constructor stub
}
public OrderBean(int id, String orderName, int customerID) {
	super();
	this.id = id;
	this.orderName = orderName;
	this.customerID = customerID;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getOrderName() {
	return orderName;
}
public void setOrderName(String orderName) {
	this.orderName = orderName;
}
public int getCustomerID() {
	return customerID;
}
public void setCustomerID(int customerID) {
	this.customerID = customerID;
}

}
