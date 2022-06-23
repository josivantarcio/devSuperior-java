package entities;

public class Student {

	private String nome;
	private double[] notas;

	public double Somatorio() {
		double somar = 0;
		for (int i = 0; i < 3; i++) {
			somar += this.notas[i];
		}
		return somar;
	}

	public String Situação() {
		if (Somatorio() > 60) {
			return "FINAL GRADE: " + Somatorio() + "\nPass";
		} else {
			return "FINAL GRADE: " + Somatorio() + "\nFAILED \nMISSING " + (60 - Somatorio()) + " POINTS";
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double[] getNotas() {
		return notas;
	}

	public void setNotas(double[] notas) {
		this.notas = notas;
	}

}
