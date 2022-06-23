package entities;

public class BusinessAccount extends Account{
	
	private Double loanLimit;
	
	public BusinessAccount() {
		super();
	}
		
	public BusinessAccount(Integer number, String houder, Double balance, Double loanLimit) {
		super(number, houder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}
	
	public void loan(Double amount) {
		if(loanLimit <= amount) {
			balance += amount * 10;
		}
	}

}
