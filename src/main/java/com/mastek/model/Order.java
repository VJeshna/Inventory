package com.mastek.model;

import java.util.Date;
import java.util.List;

public class Order {
	
	private int orderId;
	private Date orderDate;
	private List<OrderItem> itemsList;
	
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int orderId, Date orderDate, List<OrderItem> itemsList) {
		super();
		this.orderId = orderId;
		this.itemsList = itemsList;
		this.orderDate = orderDate;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public List<OrderItem> getItemsList() {
		return itemsList;
	}
	public void setItemsList(List<OrderItem> itemsList) {
		this.itemsList = itemsList;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + orderId;
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
		Order other = (Order) obj;
		if (orderId != other.orderId)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderDate=" + orderDate + ", itemsList=" + itemsList + "]";
	}

}
