package entities;

public class Conta {
	private Integer numeroConta;
	private String nomeUsuario;
	private Double saldo;
	private Double limiteSaque;
	
	public Conta(Integer numeroConta, String nomeUsuario, Double saldo, Double limiteSaque) {
		this.numeroConta = numeroConta;
		this.nomeUsuario = nomeUsuario;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(Integer numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	
	
	public void deposito(Double montante) {
		this.saldo += montante;
	}
	

	public void saque(Double montante) {
		this.saldo -= montante;
	}
	
}
