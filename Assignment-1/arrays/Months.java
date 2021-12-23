package com.thoughtfocus.arrays;

public class Months {
	private String[] months = new String[15];
	private int index = 0;

	public void printall() {
		for (int index = 0; index < months.length; index++) {
			if (months[index] != null) {
				System.out.println(months[index]);
			}
		}
	}

	public boolean save(String month) {
		if (index < 15) {
			months[index] = month;
			index++;
			return true;
		} else {
			System.out.println("There is no space");
			return false;
		}
	}

	public String delete(String month) {
		for (int index = 0; index < months.length; index++) {
			if (months[index].equals(month)) {
				months[index] = null;
				return "Deleted Month";
			}
		}
		return " Month Not Deleted";
	}
	public void update(String oldName, String newName) {
		for (int index = 0; index < months.length; index++) {
			if (months[index]!=null) {
			if (months[index].equals(oldName)) {
				months[index] = newName;
}
			}
		}
	}
}
			

