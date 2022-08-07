package main;

public class MainProgram {

	public static void main(String[] args) {
		Cliente fernando = new Cliente("fernando");
		Cliente bruno = new Cliente("bruno");
		Conta cc = new ContaCorrente(fernando);
		cc.depositar(1000.0);
		Conta cp = new ContaPoupanca(bruno);
		
		
		cc.sacar(500.0);
		cc.transferir(250.0, cp);
		
		cc.imprimirExtrato();
		cc.imprimirExtrato();
	}

}
