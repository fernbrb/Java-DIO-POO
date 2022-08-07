package main;

public class Cliente {
	private int codigo;
	private String nome;
	
	private static int sequencial = 0;
	
	public Cliente(String nome) {
		this.nome = nome;
		this.codigo = ++sequencial;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
}
