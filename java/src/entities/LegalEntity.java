package entities;

public class LegalEntity extends Person{

	private Integer numEmployee;
	
	public LegalEntity() {
		super();
	}

	public LegalEntity(String name, Double annualIncome, Integer numEmployee) {
		super(name, annualIncome);
		this.numEmployee = numEmployee;
	}
	
	public Integer getNumEmployee() {
		return numEmployee;
	}

	public void setNumEmployee(Integer numEmployee) {
		this.numEmployee = numEmployee;
	}

	@Override
	public double tax() {
		double numE = 0;
		if(numEmployee > 10) {
			numE = 0.14;
		}else {
			numE = 0.16;
		}
		return getAnnualIncome() * numE;
	}

}
