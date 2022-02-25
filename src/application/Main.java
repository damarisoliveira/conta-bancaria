package application;

import java.util.Scanner;
import entities.Conta;
import exceptions.WithdrawalException;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("-----------------------");
			System.out.println("Bem vindo ao banco Panan�");
			System.out.println("-----------------------");
			
			System.out.println("\nDigite os dados da conta banc�ria ");
			System.out.print("N�mero da conta: ");
			int numero = sc.nextInt();
			
			System.out.print("Nome do usu�rio: ");
			String nome = sc.nextLine();
			sc.nextLine();
			System.out.print("Saldo da conta: ");
			double saldo = sc.nextDouble();
			
			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();
			
			Conta conta = new Conta(numero, nome, saldo, limiteSaque);
			
			System.out.print("Deseja realizar um saque ou dep�sito? (s/d)");
			char resposta = sc.next().charAt(0);
			double valor = 0.0;
			
			if(resposta == 's') {
				System.out.print("Digite o valor que deseja sacar: ");
				valor = sc.nextDouble();
				conta.saque(valor);
			}
			else if(resposta == 'd') {
				System.out.print("Digite o valor que deseja depositar: ");
				valor = sc.nextDouble();
				conta.deposito(valor);
			}
			
			
			System.out.println("\n-----------------------");
			System.out.println(conta);
			System.out.println("-----------------------");
		
		}
		catch(WithdrawalException e) {
			System.out.println("Erro na ...: " + e.getMessage());
		}
		catch(RuntimeException e) {
			System.out.println("Erro inesperado");
		}
		finally {
			if(sc != null) {
				sc.close();
			}
		}

		
		
	}

}
