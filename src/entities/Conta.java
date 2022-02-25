package entities;

import exceptions.WithdrawalException;

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
		validandoSaque(montante);
		this.saldo -= montante;
	}

	private void validandoSaque(Double montante) {
		if(montante > getSaldo()) {
			throw new WithdrawalException("Negado! O saque precisa ser menor ou igual ao valor do saldo que é " + getSaldo());
		}
		else if(montante > getLimiteSaque()) {
			throw new WithdrawalException("O saque precisa ser menor ou igual ao valor do limite de saque diário que é " + getLimiteSaque());
		}
	}
	
	@Override
	public String toString() {
		return "Saldo atual -> " + saldo;
	}
}
