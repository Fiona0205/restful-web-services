package com.programmer.gate.restfulwebservices;

public class Payment {
	private Integer userId;
	private Integer paymentId;
	private String name;
	private Double price;
	private String details;
	protected Payment() {
		
	}
	
	public Payment(Integer userId, Integer paymentId, String name, Double price, String details) {
		super();
		this.userId = userId;
		this.paymentId = paymentId;
		this.name = name;
		this.price = price;
		this.details = details;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}

	@Override
	public String toString() {
		return String.format("Payment [userId=%s, paymentId=%s, name=%s, price=%s, details=%s]", userId, paymentId, name, price,
				details);
	}
	
	
}
