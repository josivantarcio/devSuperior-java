package entities;

import java.util.Date;

public class HourContract {
	private Date Date;
	private Double valuePerHour;
	private Integer hour;
	
	public HourContract() {
	}

	public HourContract(Date date, Double valuePerHour, Integer hour) {
		Date = date;
		this.valuePerHour = valuePerHour;
		this.hour = hour;
	}

	public Double totalValue() {
		return valuePerHour * hour;
	}

	public Date getDate() {
		return Date;
	}

	public void setDate(Date date) {
		Date = date;
	}

	public Double getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Double valuePerHour) {
		this.valuePerHour = valuePerHour;
	}

	public Integer getHour() {
		return hour;
	}

	public void setHour(Integer hour) {
		this.hour = hour;
	}
}
