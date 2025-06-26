import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // inicia a entrada

		String x;
		x = sc.next(); // inicia a entrada

		System.out.println("Você digitou isso: " + x);

		int y;
		y = sc.nextInt();

		System.out.println("Você digitou esse número: " + y);
		sc.close();

	}

}
