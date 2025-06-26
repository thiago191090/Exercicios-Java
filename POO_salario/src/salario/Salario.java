package salario;

public class Salario {
	
	//atributos do cliente
	public String nome;
	public double valorSalario;
	public double imposto;
	
	//método que calcula o valor do salário menos o desconto
	public double valorDesconto(){
		double valorfinal = valorSalario - imposto;
		return valorfinal;
	}
	
	//método que altera o valor do salário de acordo com a entrada do atributo
	public void valorPorcTotal(double proximoSalario) {
	this.valorSalario = ((valorSalario - imposto) + (valorSalario * (proximoSalario / 100)));
}
}