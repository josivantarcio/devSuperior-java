package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Installment {

	private Date dateParcela;
	private Double valueParcela;
	
	public Installment(Date dateParcela, Double valueParcela) {
		this.dateParcela = dateParcela;
		this.valueParcela = valueParcela;
	}

	public Date getDateParcela() {
		return dateParcela;
	}

	public void setDateParcela(Date dateParcela) {
		this.dateParcela = dateParcela;
	}

	public Double getValueParcela() {
		return valueParcela;
	}

	public void setValueParcela(Double valueParcela) {
		this.valueParcela = valueParcela;
	}

	@Override
	public String toString() {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		return sdf.format(dateParcela) + ", Parcela R$ " + String.format("%.2f", valueParcela);
	}
	
	
}
