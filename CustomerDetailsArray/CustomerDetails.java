package com.thoughtfocus.Array;

public class CustomerDetails {
	private String name;
	private int id;
	private long MobileNo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public long getMobileNo() {
		return MobileNo;
	}

	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}

	@Override
	public String toString() {
		return "CustomerDetails [name=" + name + ", id=" + id + ", MobileNo=" + MobileNo + "]";
	}
	
}
