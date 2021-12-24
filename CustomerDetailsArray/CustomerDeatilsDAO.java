package com.thoughtfocus.Array;

public class CustomerDeatilsDAO {

	private CustomerDetails[] details = new CustomerDetails[11];
	private int i = 0;

	public void printAll() {
		for (int i = 0; i < details.length; i++) {
			if (details[i] != null) {
				System.out.println(details[i]);
			}

		}
	}

	public void save(CustomerDetails details) {
		if (details != null) {
			this.details[i] = details;
			i++;
		}
	}

	public String deletebyName(String name) {
		for (int i = 0; i < details.length; i++) {
			if (name.equals(details[i].getName())) {
				details[i] = null;
				return "Customer Details Deleted: " + name;

			}
		}
		return "Customer Details Not Deleted";
	}

	public String deletebyCustomerId(int id) {
		for (int i = 0; i < details.length; i++) {
			if (details != null) {
				if (id == details[i].getId()) {
					details[i] = null;
					return "Customer Details Deleted: " + id;
				}
			}
		}
		return "Customer Details Not Deleted";
	}



	public String updateName(String oldName, String newName) {
		for (int i = 0; i < details.length; i++) {
			if (details != null) {
				if (details[i].getName().equals(oldName)) {
					details[i].setName(newName);
					return "Customer Details Updated";
				}
			}

		}
		return "Customer Details Not Updated";

	}
}
