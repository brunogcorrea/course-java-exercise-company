package entities;

public class Individual extends Contributors{
	private Double healthExpenditures;
	
	public Individual() {
		super();
		
	}

	public Individual(String name, Double annualIncome, Double healthExpenditures) {
		super(name, annualIncome);
		this.healthExpenditures = healthExpenditures;
	}

	public Double getHealthExpenditures() {
		return healthExpenditures;
	}

	public void setHealthExpenditures(Double healthExpenditures) {
		this.healthExpenditures = healthExpenditures;
	}

	@Override
	public double taxesPaid() {
		
		if (getAnnualIncome() < 20000.0) {
			if (healthExpenditures > 0) {
				return (getAnnualIncome() * 15 / 100) - (healthExpenditures * 50 / 100);
				
			} else {
				return getAnnualIncome() * 15 / 100;
				
			}
			
		} else {
			if (healthExpenditures > 0) {
				return (getAnnualIncome() * 25 / 100) - (healthExpenditures * 50 / 100);
				
			} else {
				return getAnnualIncome() * 25 / 100;
				
			}
			
		}
		
	}

}
