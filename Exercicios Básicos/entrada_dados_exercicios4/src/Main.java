import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite quantas vezes irá rodar:");
		int n = sc.nextInt();
		
		int in = 0;
		int out = 0;
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite um número:");
			int x = sc.nextInt();
			
			if(x<=10 && x<=20) {
				in++;
			}else {
				out++;
			}
			
		}
			
			System.out.println(in + " NÚMEROS ENTRE 10 e 20");
			System.out.println(out + " NÚMEROS FORA");
			
		sc.close();
	}

}
