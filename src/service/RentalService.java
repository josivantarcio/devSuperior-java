package service;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;

	public TaxService taxService;

	public RentalService() {
	}

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}

	public Double getPricePerHour() {
		return pricePerHour;
	}

	public void setPricePerHour(Double pricePerHour) {
		this.pricePerHour = pricePerHour;
	}

	public Double getPricePerDay() {
		return pricePerDay;
	}

	public void setPricePerDay(Double pricePerDay) {
		this.pricePerDay = pricePerDay;
	}

	
	public TaxService getTaxService() {
		return taxService;
	}

	public void setTaxService(TaxService taxService) {
		this.taxService = taxService;
	}

	public void processInvoice(CarRental carRental) {
		long t1 = carRental.getStart().getTime();
		long t2 = carRental.getFinish().getTime();
		double hour = (double)(t2 - t1) / 1000 / 60 / 60;

		double basicPayment;
		if (hour <= 12) {
			basicPayment = Math.ceil(hour) * pricePerHour;
		} else {
			basicPayment = Math.ceil(hour / 24) * pricePerDay;
		}

		double tax = taxService.tax(basicPayment);
		carRental.setInvoice(new Invoice(basicPayment, tax));

	}
}
