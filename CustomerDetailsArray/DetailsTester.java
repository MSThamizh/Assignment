package com.thoughtfocus.Array;

public class DetailsTester {
	public static void main(String[] args) {
		CustomerDetails details = new CustomerDetails();
		details.setName("A");
		details.setId(25);
		details.setMobileNo(987654321);

		CustomerDetails details1 = new CustomerDetails();
		details1.setName("B");
		details1.setId(26);
		details1.setMobileNo(987654327);

		CustomerDetails details2 = new CustomerDetails();
		details2.setName("C");
		details2.setId(27);
		details2.setMobileNo(987654320);

		CustomerDeatilsDAO dao = new CustomerDeatilsDAO();
		
		dao.save(details);
		dao.save(details1);
		dao.save(details2);

		dao.printAll();
		
		dao.updateName("A", "Aa");
		dao.deletebyName("B");
		
		dao.printAll();
		
	}

}
