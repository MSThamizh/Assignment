package com.thoughtfocus.arrays;

public class ProgLanguages {
	private String[] proglanguages = new String[15];
	private int index = 0;

	public void printall() {
		for (int index = 0; index < proglanguages.length; index++) {
			if (proglanguages[index] != null) {
				System.out.println(proglanguages[index]);
			}
		}
	}

	public boolean save(String proglanguage) {
		if (index < 15) {
			proglanguages[index] = proglanguage;
			index++;
			return true;
		} else {
			System.out.println("There is no space");
			return false;
		}
	}

	public String delete(String proglanguage) {
		for (int index = 0; index < proglanguages.length; index++) {
			if (proglanguages[index].equals(proglanguage)) {
				proglanguages[index]=null;
				return "Deleted Programming Language";
			}
			}
		return " Programming Language Not Deleted";
	}
}
