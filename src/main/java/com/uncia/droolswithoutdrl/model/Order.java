package com.uncia.droolswithoutdrl.model;

public class Order {

	private String orderId;
	private String price;

	public Order() {
	}

	public Order(String orderId, String price) {
		this.orderId = orderId;
		this.price = price;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

}
