package service;

import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {

	private Calcution pay;

	public ContractService(Calcution pay) {
		this.pay = pay;
	}

	public void processContract(Contract contract, Integer months) {

		Calendar cal = Calendar.getInstance();
		cal.setTime(contract.getDateContract());

		double valueParcela = contract.getValueContract() / months;
		
		for (int i = 1; i <= months; i++) {
			double juros = pay.Interest(valueParcela, i);
			double taxa = pay.PaymentFee(juros);

			cal.add(Calendar.MONTH, i);
			Date data = cal.getTime();

			contract.getInstallments().add(new Installment(data, (taxa+valueParcela+juros)));
		}
	}
}
