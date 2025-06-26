import java.util.Scanner;

import entities.cliente;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		cliente c; //criando o objeto c 
		
		c = new cliente(); //instanciando o objeto
		
		System.out.println("Digite o seu nome:");
		c.nome = sc.nextLine();
		
		System.out.println("Digite a sua idade:");
		c.idade = sc.nextInt();
		
		System.out.println("Digite o número do seu setor:");
		c.setor = sc.nextInt();
		
		System.out.println(c.resultado()); //imprime o método da classe cliente
		
		sc.close();
		
		

	}

}
