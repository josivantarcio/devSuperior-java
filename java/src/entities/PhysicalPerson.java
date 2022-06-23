package entities;

public class PhysicalPerson extends Person{

	private Double health;
	
	public PhysicalPerson() {
		super();
	}
	
	public PhysicalPerson(String name, Double annualIncome, Double health) {
		super(name, annualIncome);
		this.health = health;
	}
	
	public Double getHealth() {
		return health;
	}

	public void setHealth(Double health) {
		this.health = health;
	}
	
	public double expenses() {
		double value = 0;
		if(health > 0) {
			value = health * 0.5;
		}
		return value;
	}

	@Override
	public double tax() {
		double taxPerson = 0;
		if(getAnnualIncome() < 20000) {
			taxPerson = 0.15;
		}else if(getAnnualIncome() >= 20000) {
			taxPerson = 0.25;
		}
		return getAnnualIncome() * taxPerson - expenses();
	}	
}
