package com.thoughtfocus.arrays;

public class MonthTest {
	public static void main(String[] args) {
		Months months = new Months();

		months.save("January");
		months.save("February");
		months.save("March");
		months.save("April");
		months.save("May");
		months.save("June");
		months.save("July");
		months.save("August");
		months.save("September");
		months.save("October");
		months.save("November");
		months.save("December");

		months.printall();
		
		String delete = months.delete("April");
		System.out.println(delete);
		
		months.update("November", "Nov");
	
		months.printall();

	}
}

