package entities;

import exceptions.LimitException;

public abstract class Account{
	private Integer number;
	private String houder;
	protected Double balance;
	
	public Account() {
	}
	
	public Account(Integer number, String houder, Double balance) {
		super();
		this.number = number;
		this.houder = houder;
		this.balance = balance;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHouder() {
		return houder;
	}

	public void setHouder(String houder) {
		this.houder = houder;
	}

	public Double getBalance() {
		return balance;
	}

	public void setBalance(Double balance) {
		this.balance = balance;
	}

	public void withrdraw(Double amount) throws LimitException {
		balance -= amount;
	}
	
	public void deposit(Double amount) {
		balance += amount;
	}
}
