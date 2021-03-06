package application;

import java.util.ArrayList;
import java.util.List;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {

		List<Account> list = new ArrayList<>();

		list.add(new SavingsAccount(1001, "Lucas", 500.0, 0.01));
		list.add(new BusinessAccount(1002, "Maria", 1000.0, 400.0));
		list.add(new SavingsAccount(1004, "Luis", 300.0, 0.01));
		list.add(new BusinessAccount(1005, "Maria", 500.0, 500.0));

		double sum = 0.0;
		for (Account account : list) {
			sum += account.getBalance();
		}

		for (Account account : list) {
			account.deposit(10.0);
		}

		for (Account account : list) {
			System.out.printf("Updated balance for account %d: %.2f\n", account.getNumber(), account.getBalance());
		}

		System.out.printf("Total balance: %.2f", sum);
	}

}
