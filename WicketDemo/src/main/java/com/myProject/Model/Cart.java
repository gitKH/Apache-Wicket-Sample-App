package com.myProject.Model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Cart implements Serializable {
	private List<Cheese> listOfCheeses = new ArrayList<Cheese>();
	private Address billingAddress = new Address();

	public Cart() {

	}

	public List<Cheese> getListOfCheeses() {
		return listOfCheeses;
	}

	public void setListOfCheeses(List<Cheese> listOfCheeses) {
		this.listOfCheeses = listOfCheeses;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public void setBillingAddress(Address billingAddress) {
		this.billingAddress = billingAddress;
	}

	public double getTotal() {
		double total = 0;
		for (Cheese cheese : listOfCheeses) {
			total += cheese.getPrice();
		}
		return total;
	}
}
