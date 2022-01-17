package com.tf.jdbc;

import java.util.Objects;

public class StationaryShopDTO {
	private String name;
	private String type;
	private String brandName;
	private double price;
	private int quantity;
	private int serialNo;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getSerialNo() {
		return serialNo;
	}
	public void setSerialNo(int serialNo) {
		this.serialNo = serialNo;
	}
	@Override
	public String toString() {
		return "StationaryShopDTO [name=" + name + ", type=" + type + ", brandName=" + brandName + ", price=" + price
				+ ", quantity=" + quantity + ", serialNo=" + serialNo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(brandName, name, price, quantity, serialNo, type);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StationaryShopDTO other = (StationaryShopDTO) obj;
		return Objects.equals(brandName, other.brandName) && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price) && quantity == other.quantity
				&& serialNo == other.serialNo && Objects.equals(type, other.type);
	}

}
