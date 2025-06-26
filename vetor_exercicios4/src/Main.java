import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int[] vect = new int[n];
		
		for(int i=0; i<vect.length; i++) {
			System.out.print("Digite um número: ");
			vect[i] = sc.nextInt();
		}
		
		int quant = 0;
		
		System.out.println("NUMEROS PARES: ");
		
		for(int i=0; i<vect.length;i++) {
			if(vect[i] % 2 == 0) {
				System.out.print(" " + vect[i] + " ");
				quant++;
			}
		}
		System.out.println();
		
		System.out.println("QUANTIDADE DE PARES = " + quant);
		
		sc.close();

	}

}
