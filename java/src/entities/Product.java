package entities;

public class Product {
	private String name;
	private Double price;

	public Product() {
	}

	public Product(String nome, Double preco) {
		this.name = nome;
		this.price = preco;
	}

	public String getNome() {
		return name;
	}

	public void setNome(String nome) {
		this.name = nome;
	}

	public Double getPreco() {
		return price;
	}

	public void setPreco(Double preco) {
		this.price = preco;
	}

	public String priceTag() {
		return "Nome: " + getNome() + " Preço: $" + getPreco();
	}

}
