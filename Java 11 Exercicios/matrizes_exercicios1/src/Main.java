import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números: ");
		
		int n = sc.nextInt();
		
		int[][] matriz = new int[n][n];
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.println("Digite: ");
				matriz [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Diagonal Principal: ");
		System.out.println(+ matriz[0][0] + "," + matriz[1][1] + "," + matriz[2][2]);
		
		System.out.println("Diagonal Principal: ");
		for(int i=0; i<n; i++) {
			System.out.println(matriz[i][i] + " ");
		}
		
		int total = 0;
		
		for (int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(matriz [i][j] < 0) {
				total += 1;
				}
			}
		}
		
		System.out.println("Total de números negativos: " + total);
		
		sc.close();

	}

}
