import java.util.Locale;
import java.util.Scanner;

import utilities.ConversaoDolar;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o valor da conversão do dolar: ");
		double valordolar = sc.nextDouble();
		
		System.out.println("Digite o valor à comprar de dolar: ");
		double valorcompra = sc.nextDouble();
		
		double valorreal = ConversaoDolar.converter(valordolar, valorcompra);
		
		System.out.printf("O valor em real da sua compra é: %.2f%n ", valorreal);

		
		sc.close();
	}

}
