package entities;

public class Company extends Person {

	private Integer numbersOfEmployee;
	
	public Company() {
		super();
	}

	public Company(String name, Double annulIncome, Integer numbersOfEmployee) {
		super(name, annulIncome);
		this.numbersOfEmployee = numbersOfEmployee;
	}

	public Integer getNumbersOfEmployee() {
		return numbersOfEmployee;
	}

	public void setNumbersOfEmployee(Integer numbersOfEmployee) {
		this.numbersOfEmployee = numbersOfEmployee;
	}
	
	@Override
	public double tax() {
		double sum = 0.0;
		if(numbersOfEmployee <= 10) {
			sum = annualIncome * 16/100;
		} else {
			sum = annualIncome * 14/100;
		}
		return sum;
	}
}
