import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		
		int A, B, C, D, dif;
		
		Scanner sc = new Scanner(System.in);
		
		A = sc.nextInt();
	    B = sc.nextInt();
	    C = sc.nextInt();
	    D = sc.nextInt();
			
	    dif = A * B - C * D;

	    System.out.println("DIFERENCA = " + dif);	
		
		sc.close();
	}

}
