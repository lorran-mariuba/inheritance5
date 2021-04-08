package entities;

public class PhysicalPerson extends Person {

	private Double healthExpenditure;
	
	public PhysicalPerson() {
	}
		
	public PhysicalPerson(String name, Double annulaIncome, Double healthExpenditure) {
		super(name, annulaIncome);
		this.healthExpenditure = healthExpenditure;
	}

	public Double getHealthExpenditure() {
		return healthExpenditure;
	}

	public void setHealthExpenditure(Double healthExpenditure) {
		this.healthExpenditure = healthExpenditure;
	}

	@Override
	public double tax() {
		double sum1 = 0.0;
		double sum2 = 0.0;
		if(healthExpenditure != 0.0) {
			sum1 = healthExpenditure * 50/100;
		}
		if(annualIncome < 20000.00) {
			sum2 = (annualIncome * 15/100) - sum1;
		} else {
			sum2 = (annualIncome * 25/100) - sum1;
		}
		return sum2;
	}

}
