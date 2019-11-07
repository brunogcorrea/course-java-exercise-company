package entities;

public class Company extends Contributors{
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
	public double taxesPaid() {
		if (numberOfEmployees < 10) {
			return getAnnualIncome() * 16 / 100;
			
		} else {
			return getAnnualIncome() * 14 / 100;
			
		}
		
	}

}
