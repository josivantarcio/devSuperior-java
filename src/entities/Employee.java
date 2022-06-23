package entities;

public class Employee {

	private int id;
	private String name;
	private double grossSalary;
	private double tax;
	
	public Employee() {	
	}

	public Employee(int id, String name, double grossSalary) {
		super();
		this.id = id;
		this.name = name;
		this.grossSalary = grossSalary;
	}

	public double NetSalary() {
		return grossSalary - tax;
	}

	public void IncreaseSalary(double percentage) {
		grossSalary += (grossSalary * (percentage / 100));

	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getTax() {
		return tax;
	}

	public void setTax(double tax) {
		this.tax = tax;
	}

	@Override
	public String toString() {
		return "id: " + id + ", name: " + name + ", grossSalary: " + String.format("%.2f", grossSalary);
	}
	
	

}
