import java.util.Locale;
import java.util.Scanner;

import entities.deposito;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		deposito conta;
		
		System.out.println("Entre com o número da conta: ");
		int numconta = sc.nextInt();
		
		System.out.println("Entre com o nome do beneficiário: ");
		sc.nextLine();
		String nome = sc.nextLine();
		
		System.out.println("Deseja fazer um primeiro depósito? Y para sim e N para não");
		char opcao = sc.next().charAt(0); //variável para decidir o depósito
		
		if(opcao == 'Y') {
			System.out.println("Digite o valor do depósito: ");
			double depositoinicial = sc.nextDouble();
			conta = new deposito(numconta, nome, depositoinicial);
		}
		else {
			conta = new deposito(numconta, nome);
		}
		
		 
		
		System.out.println("Conta " + conta.getNumconta() + ", Nome beneficiário " + conta.getNome() + ", Saldo " + conta.getSaldoconta());
		
		System.out.println("Digite um valor a depositar: ");
		double deposit = sc.nextDouble();
		
		conta.addSaldo(deposit);
		
		System.out.println("Seu novo saldo é: " + conta.getSaldoconta());
		
		System.out.println("Digite um valor a retirar: ");
		double saque = sc.nextDouble();
		
		conta.revomeSaldo(saque);
		
		System.out.println("Seu novo saldo é: " + conta.getSaldoconta());
		
		sc.close();
	}

}
