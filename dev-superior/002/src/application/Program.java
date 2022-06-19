package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();

		System.out.print("How many employees will be registred? ");
		int quantity = sc.nextInt();

		for (int i = 0; i < quantity; i++) {
			System.out.println("Employee #" + (i + 1) + ":");
			System.out.print("ID: ");
			Long id = sc.nextLong();

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Salary: $");
			Double salary = sc.nextDouble();
			System.out.println();

			list.add(new Employee(id, name, salary));
		}

		System.out.print("Enter the employee ID that will gave salary increase: ");
		Long id = sc.nextLong();
		
		System.out.print("Enter the percentage: ");
		Double percentage = sc.nextDouble();

		Employee emp = list.stream().filter(p -> p.getId() == id)
				.findFirst().orElse(null);
		emp.setSalary(emp.salaryIncrease(emp.getSalary(), percentage));
		
		for (Employee employee : list) {
			System.out.println(employee);
		}
	}
}
