package br.com.br.poo;

public class Usuarios {

	public static void main(String[] args) {
		ContaBanco p1 = new ContaBanco();
		p1.setNumConta(1111111);
		p1.setDono("henrico");
		p1.abrirConta("CC");
		p1.depositar(300.0);
		p1.estadoAtual();
		
		ContaBanco p2 = new ContaBanco();
		p2.setNumConta(2222222);
		p2.setDono("sarah");
		p2.abrirConta("CP");
		p2.estadoAtual();
		
		p1.sacar(300.0);
		p2.sacar(300.0);
	}

}
