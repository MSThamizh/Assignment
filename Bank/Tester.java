package com.tf.bankdto;

import com.tf.bankdao.AccountHolderDAO;

public class Tester {
	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();

		AccountHolderDTO dto = new AccountHolderDTO();
		AddressDTO address = new AddressDTO();

		dto.setAccountNo(335758544);
		dto.setName("Sam");
		dto.setiFSC("TF12SM");
		dto.setMobileNo(9978567567l);
		dto.setBalance(5000);

		address.setDoorNo(1);
		address.setArea("A Street");
		address.setCity("Hosur");
		address.setPincode(635109);

		dto.setAddress(address);
		String save = dao.save(dto);
		System.out.println(save);

		AccountHolderDTO dto1 = new AccountHolderDTO();
		AddressDTO address1 = new AddressDTO();

		dto1.setAccountNo(335758545);
		dto1.setName("Ram");
		dto1.setiFSC("TF13RM");
		dto1.setMobileNo(9727866476l);
		dto1.setBalance(1000);

		address1.setDoorNo(7);
		address1.setArea("R Street");
		address1.setCity("Ooty");
		address1.setPincode(643001);

		dto1.setAddress(address1);
		String save1 = dao.save(dto1);
		System.out.println(save1);

		System.out.println("---------------------------------");

		dao.showAccountDetails();

		System.out.println("---------------------------------");

		AccountHolderDTO accountDetailsByName = dao.getByName("Ram");
		System.out.println("Account Details By Name:" + accountDetailsByName);

		System.out.println("---------------------------------");

		String deleteAccount = dao.deleteByAccountNumber(335758544);
		System.out.println(deleteAccount);

		dao.showAccountDetails();

		System.out.println("---------------------------------");

		String updateAccount = dao.updateContact(9727866476l, 8927866476l);
		System.out.println(updateAccount);

		dao.showAccountDetails();

		System.out.println("---------------------------------");

		float balance = dao.showBalance(335758545);
		System.out.println(balance);

		float deposit = dao.deposit(1000, 335758545);
		System.out.println(deposit);

		float withdraw = dao.withdraw(500, 335758545);
		System.out.println(withdraw);
		
		System.out.println("---------------------------------");

		dao.showAccountDetails();
	}
}
