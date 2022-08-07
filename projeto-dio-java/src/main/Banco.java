package main;

import java.util.Iterator;
import java.util.List;

public class Banco {
	private String nome;
	
	
	private List<Conta> contas;
		
	public void imprimirContas() {
		Iterator<Conta> iterator = contas.iterator();
		while(iterator.hasNext()) {
			System.out.println(contas);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
