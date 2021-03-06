package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.WorkerLevel;

public class Worker {

	private String name;
	private WorkerLevel workerLevel;
	private Double baseSalary;

	private Departament departament;
	private List<HourContract> contracts = new ArrayList<>();

	public Worker() {
	}

	public Worker(String name, WorkerLevel workerLevel, Double baseSalary, Departament departament) {
		this.name = name;
		this.workerLevel = workerLevel;
		this.baseSalary = baseSalary;
		this.departament = departament;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public WorkerLevel getWorkerLevel() {
		return workerLevel;
	}

	public void setWorkerLevel(WorkerLevel workerLevel) {
		this.workerLevel = workerLevel;
	}

	public Double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(Double baseSalary) {
		this.baseSalary = baseSalary;
	}

	public Departament getDepartament() {
		return departament;
	}

	public void setDepartament(Departament departament) {
		this.departament = departament;
	}

	public List<HourContract> getContracts() {
		return contracts;
	}

	public void addContract(HourContract contract) {
		contracts.add(contract);
	}

	public void removeContract(HourContract contract) {
		contracts.remove(contract);
	}

	public double income(int year, int month) {
		double sum = baseSalary;
		Calendar calendar = Calendar.getInstance();
		for (HourContract contract : contracts) {
			calendar.setTime(contract.getDate());
			int contractYear = calendar.get(Calendar.YEAR);
			int contractMonth = 1 + calendar.get(Calendar.MONTH);

			if (year == contractYear && month == contractMonth) {
				sum += contract.totalValue();
			}
		}
		return sum;
	}

}
