package com.mastek.model;

public class Product {
	
	private String prodId;
	private String prodName;
	private double unitPrice;
	private int availQty;
	
	public Product() {
		super();
	}
	public Product(String prodId, String prodName, double unitPrice, int availQty) {
		super();
		this.prodId = prodId;
		this.prodName = prodName;
		this.unitPrice = unitPrice;
		this.availQty = availQty;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public double getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	public int getAvailQty() {
		return availQty;
	}
	public void setAvailQty(int availQty) {
		this.availQty = availQty;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((prodId == null) ? 0 : prodId.hashCode());
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
		Product other = (Product) obj;
		if (prodId == null) {
			if (other.prodId != null)
				return false;
		} else if (!prodId.equals(other.prodId))
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", unitPrice=" + unitPrice + ", availQty="
				+ availQty + "]";
	}
	
}
