package br.com.locadora;

public class Veiculo {
	private String placa;
	protected String marca;

	public Veiculo() {
		super();
	}

	public Veiculo(String placa, String marca) {
		super();
		this.placa = placa;
		this.marca = marca;
	}

	public String consultar(){
		return placa + " - " + marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	@Override
	public boolean equals(Object obj) {
		Veiculo v = (Veiculo) obj;
		return v.getPlaca().equals(this.placa);
	}
	
}
