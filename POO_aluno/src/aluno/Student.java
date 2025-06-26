package aluno;

public class Student {
	public String aluno;
	public double nota1;
	public double nota2;
	public double nota3;
	
	public double resultado() {
		double resultado = nota1 + nota2 + nota3;
		return resultado;
	}
	
	public double diferenca() {
		
		double diferenca = resultado();
		
		if (diferenca > 60.0) {
			return 60.0 - diferenca;
		}
		else {
			return 0.0;
		}
	}
	
	
}
