package br.com.br.poo;

public class ContaBanco {
	
	public Integer numConta;
	protected String tipo;
	private String dono;
	private Double saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("----------------------");
		System.out.println("conta: " +this.getNumConta());
		System.out.println("tipo: " +this.getTipo());
		System.out.println("Dono: " +this.getDono());
		System.out.println("saldo: " +this.getSaldo());
		System.out.println("status: " +this.isStatus());
		System.out.println("----------------------");
	}
	
	
public ContaBanco() {
	this.setSaldo(0.0);
	this.setStatus(false);
	     
}

public Integer getNumConta() {
		return numConta;
	}

	public void setNumConta(Integer numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	
	
public void abrirConta(String tipo) {
	 setTipo(tipo);
	 setStatus(true);
	 
	if(tipo == "CC") {
		 this.setSaldo(50.00);// 
		 System.out.println("conta corrente aberta com sucesso");
	}
	else if(tipo == "CP") {
		this.setSaldo(150.00);
		System.out.println("conta poupança aberta com sucesso");
	}
	
	
}

public void fecharConta() {
	if(saldo < 0.0) {
		System.out.println("Vc esta devendo algo pague para fechar a connta");
	}
	else if(saldo > 0.0) {
		System.out.println("Vc tem dinherio em sua conta saque para fechar conta");
	}
	else {
		setStatus(false);
		System.out.println("conta fechada com sucesso");
	}
	
	
	
}

public void depositar( Double valor) {
	if(isStatus()) {
		
	this.setSaldo(this.getSaldo() + valor);
	System.out.println("valor de : "+ valor + " depositado com sucesso.");
	}
	else {
		System.out.println("erro, conta fechada");
	}
}
public void sacar( Double valor) {
	
	if(isStatus()) {
		
		if(this.getSaldo() >= valor) {
		this.setSaldo(this.getSaldo() - valor);
		System.out.println("saque no valor de: "+ valor + " realizado na conta do(a): "+ this.getDono());
		}
		else if(getSaldo() < valor) {
			System.out.println("saldo insuficiente na conta do(a): "+ this.getDono());
		}
	}
		
	else {
		System.out.println("erro, conta fechada");
	}
	
}

public void  pagarMensal() {
	if(isStatus()) {
		if(getTipo() == "CC") {
			if(getSaldo() > 12.0)
			setSaldo(getSaldo() - 12.0);
			
		}
		if(getTipo() == "CP") {
			if(getSaldo() > 20.0)
			setSaldo(getSaldo() - 20.0);
			
		}
	}
		
}
















}