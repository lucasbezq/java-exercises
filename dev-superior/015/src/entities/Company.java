package entities;

public class Company extends TaxPayer {

	private static double MINIMUM_TAX = 0.14;
	private static double MAXIMUM_TAX = 0.16;
	private static int TOTAL_NUMBER_FOR_MINIMUM_TAX = 10;

	private Integer numberOfEmployees;

	public Company() {
		super();
	}

	public Company(String name, Double annualIncome, Integer numberOfEmployees) {
		super(name, annualIncome);
		this.numberOfEmployees = numberOfEmployees;
	}

	public Integer getNumberOfEmployees() {
		return numberOfEmployees;
	}

	public void setNumberOfEmployees(Integer numberOfEmployees) {
		this.numberOfEmployees = numberOfEmployees;
	}

	@Override
	public Double tax() {
		if (numberOfEmployees > TOTAL_NUMBER_FOR_MINIMUM_TAX) {
			annualIncome *= MINIMUM_TAX;
		} else {
			annualIncome *= MAXIMUM_TAX;
		}
		return annualIncome;
	}

}
