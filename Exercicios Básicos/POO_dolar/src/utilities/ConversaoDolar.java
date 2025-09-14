package utilities;

public class ConversaoDolar {
		
	public static double converter(double valordolar, double valorcomprar){
		valorcomprar = valorcomprar + (valorcomprar * 0.06); 
		double valorreais = (valordolar * valorcomprar);
		return valorreais;
}
}