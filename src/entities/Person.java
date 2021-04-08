package entities;

public abstract class Person {

	protected String name;
	protected Double annualIncome;
	
	public Person() {
	}

	public Person(String name, Double annulaIncome) {
		this.name = name;
		this.annualIncome = annulaIncome;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getAnnualIncome() {
		return annualIncome;
	}

	public void setAnnualIncome(Double annulIncome) {
		this.annualIncome = annulIncome;
	}
	
	public abstract double tax();
}
