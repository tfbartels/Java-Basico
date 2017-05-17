package br.com.locadora;

public class Cliente {
	
	private String cpf;
	private String nome;
	private String endereco;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Cliente(String cpf, String n, String e){
		this.cpf = cpf;
		nome = n;
		endereco = e;
	}
	
	public void consultar(){
		System.out.println("Cliente: "+nome + " - Cpf: "+cpf);
	}
	
	@Override
	public String toString() {
		return this.nome;
	}
	
	@Override
	public boolean equals(Object obj) {
		Cliente c = (Cliente) obj;
		return c.nome.equals(this.nome);
	}
	
}
