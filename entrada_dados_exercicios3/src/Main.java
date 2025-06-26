import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int senha = 0;
		
		Scanner sc = new Scanner(System.in);
		
		senha = sc.nextInt();
		
		while(senha != 2002) {
			System.out.println("Senha Inválida!");
			senha = sc.nextInt();
		}
		
		System.out.println("Acesso Liberado!");
	}

}
