package entities;

public class Individual extends TaxPayer {

	private static double MINIMUM_TAX = 0.15;
	private static double MAXIMUM_TAX = 0.25;
	private static double HEALTING_SPENDING_DISCOUNT = 0.50;

	private Double healthSpending;

	public Individual() {
		super();
	}

	public Individual(String name, Double annualIncome, Double healthSpeding) {
		super(name, annualIncome);
		this.healthSpending = healthSpeding;
	}

	public Double getHealthSpeding() {
		return healthSpending;
	}

	public void setHealthSpeding(Double healthSpeding) {
		this.healthSpending = healthSpeding;
	}

	@Override
	public Double tax() {
		if (annualIncome < 20000.0) {
			annualIncome *= MINIMUM_TAX;
		} else {
			annualIncome *= MAXIMUM_TAX;
		}
		if (healthSpending > 0) {
			annualIncome -= healthSpending * HEALTING_SPENDING_DISCOUNT;
		}
		return annualIncome;
	}
}
