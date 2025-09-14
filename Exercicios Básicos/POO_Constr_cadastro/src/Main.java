import java.util.Scanner;

import entities.copy.Cadastro;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Digite o seu nome: ");
		String name = sc.nextLine();
		
		System.out.println("Digite o seu CPF: ");
		String cpf = sc.nextLine();
		
		System.out.println("Digite o seu RG: ");
		String rg = sc.nextLine();
		
		Cadastro usuario = new Cadastro(name, cpf, rg);
		
		System.out.println(usuario.toString());
		
		
		sc.close();
		
	}
	
}
