package com.tf.bankdto;

public class AccountHolderDTO {
	private String name;
	private long accountNo;
	private String iFSC;
	private long mobileNo;
	private float balance;
	private AddressDTO address;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "AccountHolderDTO [name=" + name + ", accountNo=" + accountNo + ", iFSC=" + iFSC + ", mobileNo="
				+ mobileNo + ", balance=" + balance + ", address=" + address + "]";
	}

}
