package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	
	private Integer numbContract;
	private Date dateContract;
	private Double valueContract;
	
	private List<Installment> installments = new ArrayList<Installment>(); 

	public Contract() {
	}

	public Contract(Integer numbContract, Date dateContract, Double valueContract) {
		this.numbContract = numbContract;
		this.dateContract = dateContract;
		this.valueContract = valueContract; 
	}

	public Integer getNumbContract() {
		return numbContract;
	}

	public void setNumbContract(Integer numbContract) {
		this.numbContract = numbContract;
	}

	public Date getDateContract() {
		return dateContract;
	}

	public void setDateContract(Date dateContract) {
		this.dateContract = dateContract;
	}

	public Double getValueContract() {
		return valueContract;
	}

	public List<Installment> getInstallments() {
		return installments;
	}
}
