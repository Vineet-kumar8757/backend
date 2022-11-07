package com.example.demo.ResponseClassses;

public class OrdersResponse {
	private long orderId;
	private Product product;
	private long quantity;
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	private String orderStatus;
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public OrdersResponse(long quantity,long orderId, Product product, String orderStatus) {
		super();
		this.quantity = quantity;
		this.orderId = orderId;
		this.product = product;
		this.orderStatus = orderStatus;
	}
	public OrdersResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
