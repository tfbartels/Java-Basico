package br.com.locadora;

public class Onibus extends Veiculo {
	
	public Onibus(String p, String m, int qtdeLugares) {
		super(p, m);
		this.qtdeLugares = qtdeLugares;
	}

	private int qtdeLugares;

	public int getQtdeLugares() {
		return qtdeLugares;
	}

	public void setQtdeLugares(int qtdeLugares) {
		this.qtdeLugares = qtdeLugares;
	}
	
	@Override
	public String consultar() {
		return "Onibus: " + getPlaca() + " - " + marca + " - " + qtdeLugares;
	}
	
	@Override
	public String toString() {
		return this.getPlaca();
	}
	
	@Override
	public boolean equals(Object arg0) {
		Onibus o1 = (Onibus) arg0;
		return this.getPlaca() == o1.getPlaca();
	}
	
}
