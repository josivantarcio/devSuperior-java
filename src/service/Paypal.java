package service;

public class Paypal implements Calcution{

	@Override
	public Double PaymentFee(Double fee) {
		return fee * 0.02;
	}

	@Override
	public Double Interest(Double amount, Integer month) {
		return amount * month * 0.01;
	}

	
	

}
