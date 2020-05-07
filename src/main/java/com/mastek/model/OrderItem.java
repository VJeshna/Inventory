package com.mastek.model;

public class OrderItem {
	
	private int id;
	private String productID;
	private int orderQty;
	
	public OrderItem() {
		super();
		// TODO Auto-generated constructor stub
	}
	public OrderItem(int id, String productID, int orderQty) {
		super();
		this.id = id;
		this.productID = productID;
		this.orderQty = orderQty;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public int getOrderQty() {
		return orderQty;
	}
	public void setOrderQty(int orderQty) {
		this.orderQty = orderQty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", productID=" + productID + ", orderQty=" + orderQty + "]";
	}

}
