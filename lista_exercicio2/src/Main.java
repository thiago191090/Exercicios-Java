import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		System.out.println("Digite quantas pessoas quer cadastrar: ");
		n = sc.nextInt();
		
		List<Pessoas> pessoa = new ArrayList<>();
		
		for(int i=0; i<n; i++) {
			sc.nextLine();
			
			System.out.println("Digite o nome da "+ (i+1) +"ª pessoa: ");
			String nome = sc.nextLine();
			System.out.println("Digite a idade da "+ (i+1) +"ª pessoa: ");
			Integer idade = sc.nextInt();
			System.out.println("Digite o salário da "+ (i+1) +" pessoa: ");
			Double salario = sc.nextDouble();
			
			Pessoas cadastro = new Pessoas(nome, idade, salario);
			
			pessoa.add(cadastro);
			
		}
		
		
		System.out.println(pessoa);
		
		System.out.println(pessoa.get(0).salario);
		
		
		sc.close();

	}

}
