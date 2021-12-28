package com.tf.bankdao;

import java.util.ArrayList;
import java.util.Iterator;

import com.tf.bankdto.AccountHolderDTO;

public class AccountHolderDAO {

	private ArrayList<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();

	public String save(AccountHolderDTO dto) {
		boolean Save = dtos.add(dto);
		if (Save) {
			return "Account Details is Saved";
		} else {
			return "Account Details is not saved";
		}
	}

	public AccountHolderDTO getByName(String name) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getName().equals(name)) {
				return dtos.get(i);
			}
		}
		return null;
	}
	
	public String deleteByAccountNumber(long accountNo) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountNo() == accountNo) {
				dtos.remove(i);
				return "Account details deleted";
			}
		}
		return "Account details not deleted";
	}

	public String updateContact(long oldMobileNo, long newMobileNo) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getMobileNo() == oldMobileNo) {
				dtos.get(i).setMobileNo(newMobileNo);
				return "Mobile Number is updated";
			}
		}
		return "Mobile Number is not updated";
	}

	public void showAccountDetails() {
		for (int i= 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountNo() != 0) {
				System.out.println(dtos.get(i));
			}
		}
	}

	public float showBalance(long accountNumber) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountNo() == accountNumber) {
				return dtos.get(i).getBalance();

			}
		}
		return 0.0f;
	}

	public float deposit(float amount, long accountNo) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountNo() == accountNo) {
				float oldBalance = dtos.get(i).getBalance();
				float newBalance = oldBalance + amount;
				dtos.get(i).setBalance(newBalance);
				return newBalance;
			}
		}
		return 0.0f;
	}

	public float withdraw(float amount, long accountNo) {
		for (int i = 0; i < dtos.size(); i++) {
			if (dtos.get(i).getAccountNo() == accountNo) {
				if (dtos.get(i).getBalance() > amount) {
					float finalBalance = dtos.get(i).getBalance() - amount;
					dtos.get(i).setBalance(finalBalance);
					return finalBalance;
				}
			}
		}
		return 0.0f;
	}

}
