package main;

public abstract class Conta implements iConta {
	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;
	
	private static final int AGENCIA_PADRAO = 0001;
	private static int sequencial = 1;
	
	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = sequencial++;
		this.cliente = cliente;
	}
	
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	@Override
	public void sacar(double valor) {
		this.saldo -= valor;
		System.out.println("!!! SAQUE EFETUADO !!!");
		imprimirSaldo();
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
		System.out.println("!!! DEPÓSITO EFETUADO !!!");
		imprimirSaldo();
	}

	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.saldo -= valor;
		contaDestino.saldo += valor;
		System.out.println("!!! TRANSFERÊNCIA EFETUADA COM SUCESSO !!!");
		System.out.println("Saldo: " + this.cliente.getNome() + " -> " + String.format("%.2f", this.saldo));
		System.out.println("Saldo: " + contaDestino.cliente.getNome() + " -> " + String.format("%.2f", contaDestino.saldo));

	}
	@Override
	public void imprimirSaldo() {
		System.out.println(String.format("Saldo atual: %.2f", this.saldo));
	}
	
	protected void imprimirDados() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}

	
}
