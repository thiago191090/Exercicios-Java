import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		List<String> pessoas = new ArrayList<>();
		
		int n;
		
		System.out.println("Digite quantas pessoas quer acrescentar: ");
		n = sc.nextInt();
		
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			
			System.out.println("Digite a "+ (i+1) + "ª pessoa: ");
			
			String pessoa = sc.nextLine();
			
			pessoas.add(pessoa);
			
		}
		
		System.out.println(pessoas);
		
		
		
		sc.close();

	}

}
