import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int inteiro;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número inteiro:");
		inteiro = sc.nextInt();
		
		if(inteiro < 0) {
			System.out.println("O número é negativo");
		}
		else {
			System.out.println("O número é positivo!");
		}
	
		sc.close();

	}
		
}
