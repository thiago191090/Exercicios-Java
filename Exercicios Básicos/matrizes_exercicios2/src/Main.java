import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o número de linhas: ");
		int M = sc.nextInt();
		
		System.out.println("Digite o número de colunas: ");
		int N = sc.nextInt();
		
		int[][] mat = new int[M][N];
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				System.out.print("Digite o próximo número: ");
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Digite um número da matriz: ");
		int num = sc.nextInt();
		
		for(int i=0; i<M; i++) {
			for(int j=0; j<N; j++) {
				if(num == mat[i][j]) {
					System.out.println("Número escolhido: " + num);
					System.out.println("Na posição: "+ i + ","+j);
					
					if(j == 0) {
						System.out.println("Nada a esquerda!");
					}else {
						System.out.println("Esquerda: " + mat[i][j-1]);
					}
					
					if(j == N -1) {
						System.out.println("Nada a direita!");
					}else {
						System.out.println("Direita: " + mat[i][j+1]);
					}
					
					if(i == 0) {
						System.out.println("Nada acima!");
					}else {
						System.out.println("Acima: " + mat[i-1][j]);
					}
					
					if(i == M -1) {
						System.out.println("Nada abaixo!");
					}else {
						System.out.println("Abaixo: " + mat[i+1][j]);
					}
					
				}
			}
		}
		
		
		
		
		sc.close();

	}

}
