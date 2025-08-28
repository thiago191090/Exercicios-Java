package entities;

public class Pessoas {
	
	public String nome;
	public Integer idade;
	public Double salario;
	
	public Pessoas(String nome, Integer idade, Double salario) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Pessoas [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}
	
	

}
