package com.beans;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "Customer")
public class Customer {

	private int customerID;
	private String firstName;
	private String lastName;
	private String email;
	private String address;
	private int numOfOrders;

	public int getCustomerID() {
		return customerID;
	}
	
	@XmlElement
	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getFirstName() {
		return firstName;
	}
	
	@XmlElement
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@XmlElement
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	@XmlElement
	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	@XmlElement
	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumOfOrders() {
		return numOfOrders;
	}

	@XmlElement
	public void setNumOfOrders(int numOfOrders) {
		this.numOfOrders = numOfOrders;
	}

}
