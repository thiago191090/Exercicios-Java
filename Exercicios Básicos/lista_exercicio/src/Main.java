import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Funcionarios;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<Funcionarios> func = new ArrayList<>(); //criando a lista func no objeto Funcionarios
		
		System.out.print("Quantos usuários serão registrados? ");
		int n = sc.nextInt(); //Recebendo quantos usuários serão registrados
		
		for(int i=0; i<n; i++) { //For para acrescentar os funcionários e criar os objetos
			
			System.out.println("Funcionário #"+(i+1)+":");
			
			System.out.print("Id: ");
			Integer id = sc.nextInt();
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			
			System.out.print("Salário: ");
			Double salario = sc.nextDouble();
			
			Funcionarios funcionario = new Funcionarios(id, nome, salario); //cria o objeto
			
			func.add(funcionario); //Adiciona o objeto a lista
			
		}
		
		System.out.println("Digite o ID do funcionário que terá o salário incrementado: ");
		int idsalario = sc.nextInt();
		
		Integer posit = posicao(func, idsalario); //chama a função de percorrer a lista, e encontrar o ID
		
		if(posit == null) { //se a função retornar nulo, imprime o erro
			System.out.println("Esse valor não existe!");
		}
		else {
			System.out.println("Entre com a porcentagem: "); //se a função encontrar o ID, faz o acrescimo do salário
			double aumentosalario = sc.nextDouble();
			
			func.get(posit).acrescentarSalario(aumentosalario); //chama a função da classe Funcionarios, e calcula o aumento do salário
			
		}
		
		System.out.println("Lista de funcionários: ");
		
		System.out.println(func);
		
		sc.close();

	}
	
		public static Integer posicao(List<Funcionarios> func, int idsalario){
			for(int i=0; i < func.size(); i++) {
				if(func.get(i).getId() == idsalario) {
					return i;
				}
			}
			return null;
			}
			
		}



