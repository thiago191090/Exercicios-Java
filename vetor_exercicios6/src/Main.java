import java.util.Locale;
import java.util.Scanner;

import entities.quartos;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		quartos[] vect = new quartos[10];
		
		int est;
		
		System.out.print("Digite quantos estudantes vão alugar quartos: ");
		est = sc.nextInt();
		
		for(int i=1; i<=est; i++) {
			
			System.out.println("Aluno #"+ i);
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Email: ");
			String email = sc.nextLine();
			
			System.out.print("Quarto: ");
			int num = sc.nextInt();
			
			System.out.println();
			
			vect[num] = new quartos(nome, email, num);
			
		}
		
		System.out.println("Quartos alugados: ");
		
		for(int i=0; i<vect.length; i++) {
			if(vect[i] != null) {
				System.out.println(vect[i]);
			}
		}
		
		
		
		sc.close();
	}

}
