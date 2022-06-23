package entities;

import exceptions.LimitException;

public class ContaExercicio164 extends Account {

	private Double withdrawLimit;

	public ContaExercicio164(Integer number, String houder, Double balance, Double withdrawLimit) {
		super(number, houder, balance);
		this.withdrawLimit = withdrawLimit;
	}

	public Double getWithdrawLimit() {
		return withdrawLimit;
	}

	public void setWithdrawLimit(Double withdrawLimit) {
		this.withdrawLimit = withdrawLimit;
	}

	@Override
	public void withrdraw(Double amount) throws LimitException {
		if (withdrawLimit >= amount && balance >= amount) {
			super.withrdraw(amount);
		}
		if(withdrawLimit < amount) {
			throw new LimitException("The Amount exceeds withdraw limit");
		}
		if(balance < amount) {
			throw new LimitException("Not Enough balance");
		}
	}
}
