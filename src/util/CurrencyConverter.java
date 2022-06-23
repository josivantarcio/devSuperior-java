package util;

public class CurrencyConverter {
	
	private static final double TAX = 6;
	
	public static double Convert(double price, double dollar) {
		double cota = (price * dollar);
		return cota += (cota * (TAX/100));
		
	}
}
