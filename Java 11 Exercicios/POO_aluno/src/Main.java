import java.util.Locale;
import java.util.Scanner;

import aluno.Student;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student estudante;
		
		estudante = new Student();
		
		System.out.println("Digite o nome do estudante: ");
		estudante.aluno = sc.nextLine();
		
		System.out.println("Digite a nota do 1 trimestre: ");
		estudante.nota1 = sc.nextDouble();
		
		if(estudante.nota1 < 0 || estudante.nota1 > 30) {
			System.out.println("Nota incorreta, digite novamente: ");
			estudante.nota1 = sc.nextDouble();
		}
		
		System.out.println("Digite a nota do 2 trimestre: ");
		estudante.nota2 = sc.nextDouble();
		
		if(estudante.nota2 < 0 || estudante.nota1 > 35) {
			System.out.println("Nota incorreta, digite novamente: ");
			estudante.nota2 = sc.nextDouble();
		}
		
		System.out.println("Digite a nota do 3 trimestre: ");
		estudante.nota3 = sc.nextDouble();
		
		if(estudante.nota3 < 0 || estudante.nota1 > 35) {
			System.out.println("Nota incorreta, digite novamente: ");
			estudante.nota3 = sc.nextDouble();
		}
		
		System.out.printf("Olá aluno " + estudante.aluno + "! sua nota final é %.2f ! ",estudante.resultado());
		
		if(estudante.resultado() < 60) {
			System.out.println("Você não passou!");
			System.out.printf("Faltou %.2f pontos!", estudante.diferenca());
		}
		else {
			System.out.println("Você passou!");
		}
		
		
		
		sc.close();
	}
		
	}
	
