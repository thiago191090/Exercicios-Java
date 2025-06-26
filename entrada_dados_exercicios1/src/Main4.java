import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int F, H, cal;
		double S;
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		F = sc.nextInt();
		H = sc.nextInt();
		S = sc.nextDouble();
		
		cal = (int) (H * S);
		
		System.out.println("NUMBER = "+ F);
		System.out.println("SALARY = "+ cal);
		
		sc.close();

	}

}
