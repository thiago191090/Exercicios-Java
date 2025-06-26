import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		
		System.out.print("Quantas pessoas serão digitadas? ");
		n = sc.nextInt();
		
		Pessoas[] pessoa = new Pessoas[n];
		
		int posicao = 0;
		
		for(int i=0; i<n; i++) {
			
			posicao += 1;
			
			System.out.println("Dados da " + posicao + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			
			pessoa[i] = new Pessoas(nome, idade, altura);
			
			
		}
		
		double somaaltura = 0;
	
		for(int i=0; i<pessoa.length; i++) {
			somaaltura += pessoa[i].getAltura();
		}
		
		double mediaaltura = somaaltura / n;
		
		System.out.println("Altura média: " + mediaaltura);
		
		int menores = 0;
		
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				menores++;
			}
			
		}
		
		double percent = ((double)menores / n) * 100.00;
		
		System.out.println("Pessoas com menos de 16 anos: "+ menores + " Porcentagem: "+ percent);
		
		for(int i=0; i<pessoa.length; i++) {
			if(pessoa[i].getIdade() < 16) {
				System.out.println(pessoa[i].getNome());
			}
			
		}
		
		sc.close();

	}

}
