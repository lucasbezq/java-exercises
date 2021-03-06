package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<TaxPayer> list = new ArrayList<>();

		System.out.print("Enter the number of tax payers: ");
		int taxPayers = sc.nextInt();

		for (int i = 1; i <= taxPayers; i++) {
			System.out.println();
			System.out.println("Tax payer #" + i + ":");
			System.out.print("Individual or Company (i/c): ");
			char question = sc.next().charAt(0);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Anual income: ");
			double annualIncome = sc.nextDouble();
			if (question == 'i') {
				System.out.print("Health spendings: $");
				double healthSpending = sc.nextDouble();

				list.add(new Individual(name, annualIncome, healthSpending));
			} else {
				System.out.print("Number of employees: ");
				int numberOfEmployees = sc.nextInt();

				list.add(new Company(name, annualIncome, numberOfEmployees));
			}
		}

		double sum = 0.0;
		System.out.println();
		System.out.println("TAX PAID: ");
		for (TaxPayer payer : list) {
			double tax = payer.tax();
			System.out.println(payer.getName() 
					+ String.format(": $%.2f", tax));
			sum += tax;
		}

		System.out.println();
		System.out.println(String.format("TOTAL TAXES: $%.2f", sum));
		
		sc.close();
	}

}
