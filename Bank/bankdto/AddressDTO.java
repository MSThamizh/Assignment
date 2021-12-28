package com.tf.bankdto;

public class AddressDTO {
	private int doorNo;
	private String area;
	private String city;
	private int pincode;

	public int getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(int doorNo) {
		this.doorNo = doorNo;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "AddressDTO [doorNo=" + doorNo + ", area=" + area + ", city=" + city + ", pincode=" + pincode + "]";
	}
}
