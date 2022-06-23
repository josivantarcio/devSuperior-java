package entities;

public class ImportedProduct extends Product{

	private Double customsFee;

	public ImportedProduct() {
		super();
	}

	public ImportedProduct(String nome, Double preco, Double customsFee) {
		super(nome, preco);
		this.customsFee = customsFee;
	}

	public Double getCustomsFee() {
		return customsFee;
	}

	public void setCustomsFee(Double customsFee) {
		this.customsFee = customsFee;
	}

	public Double totalPrice() {
		return getPreco() + customsFee;
	}
	
	@Override
	public String priceTag() {
		return totalPrice() + " (Customs fee: $ " + getCustomsFee()+")";	}
}
