package br.com.locadora;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Locadora {
	
	private Collection<Cliente> clientes;
	private Collection<Veiculo> veiculos;
	private Collection<Aluguel> alugueis;
	
	
	public Locadora(){
		clientes = new ArrayList<Cliente>();
		veiculos = new HashSet<Veiculo>();
		alugueis = new ArrayList<Aluguel>();
	}
	
	public Veiculo encontrarVeiculo(String placa){
		Veiculo retorno = null;
		
		for (Veiculo v : veiculos){
			if (v.getPlaca().equals(placa)){
				retorno = v;
			}
		}
		
		return retorno;
	}
	
	public void cadastrarVeiculo(Veiculo novoVeiculo){
		veiculos.add(novoVeiculo);
	}
	
	public void listarVeiculos(){
		for (Veiculo veiculo : veiculos){
			System.out.println("Veiculo: "+veiculo.getMarca() + " - " + veiculo.getPlaca());
		}
	}
	
	public Cliente encontrarCliente(String nome){
		Cliente retorno = null;
		
		for (Cliente c: clientes){
			if (c.getNome().equals(nome)){
				retorno = c;
			}
		}
		
		return retorno;
	}
	
	public void cadastrarCliente(Cliente novoCliente){
		clientes.add(novoCliente);
	}
	
	public void listarClientes(){
		System.out.println(clientes);
	}
	
	public boolean efetuarAluguel(String nomeCliente, String placa, String dataFim, double preco) throws NaoEncontradoException{
		
		boolean retorno = false;
		
		Cliente cliente = encontrarCliente(nomeCliente);
		if (cliente == null){
			throw new NaoEncontradoException("Cliente nao encontrado");
		}
		
		Veiculo veiculo = encontrarVeiculo(placa);
		if (veiculo == null){
			throw new NaoEncontradoException("Placa nao encontrada");
		}
		
		Aluguel aluguel = new Aluguel();
		aluguel.setCliente(cliente);
		aluguel.setVeiculo(veiculo);
		aluguel.setDataInicio("15/05/2017");
		aluguel.setDataFim(dataFim);
		aluguel.setPreco(preco);
		
		alugueis.add(aluguel);
		retorno = true;
		
		return retorno;
		
	}
	
	
}


class NaoEncontradoException extends Exception {
	
	public NaoEncontradoException(String msg){
		super(msg);
	}
}