package br.com.cofrinho;

import java.util.ArrayList;
import java.util.List;


public class Cofrinho {
	
	List<Moeda> moedas = new ArrayList<Moeda>();
	
	public void adicionarMoeda(Moeda moeda){
		moedas.add(moeda);
	}
	
	public double calcularTotal(){
		double total = 0d;
		
		for (Moeda m : moedas){
			total += m.getValor();
		}
		
		return total;
	}
	
	public double calcularTotal(Moeda moeda){
		int total = 0;
		
		for (Moeda m : moedas){
			if (m.equals(moeda)){
				total++;
			}
		}
		
		return total;
	}
	
	public double maiorValor(){
		double maior = 0d;
		
		for (Moeda m : moedas){
			if (m.getValor() > maior){
				maior = m.getValor();
			}
		}
		
		return maior;
		
	}
	
	public static void main(String[] args) {
		
		Cofrinho meuCofre = new Cofrinho();
		meuCofre.adicionarMoeda(new Moeda("Um real", 1.0d));
		meuCofre.adicionarMoeda(new Moeda("2 reais", 2.0d));
		meuCofre.adicionarMoeda(new Moeda("25 centavos", 0.25d));
		meuCofre.adicionarMoeda(new Moeda("50 centavos", 0.5d));
		meuCofre.adicionarMoeda(new Moeda("Cenziho", 100.0d));
		meuCofre.adicionarMoeda(new Moeda("2 reais", 2.0d));
		meuCofre.adicionarMoeda(new Moeda("25 centavos", 0.25d));
		
		System.out.println("Total: "+meuCofre.calcularTotal());
		System.out.println("Total de 0.25: "+meuCofre.calcularTotal(new Moeda("25 centavos", 0.25d)));
		System.out.println("Maior valor: "+meuCofre.maiorValor());
		
	}
	
	
	
	
	
}
