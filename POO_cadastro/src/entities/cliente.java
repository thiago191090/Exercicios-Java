package entities;

public class cliente {
	
	//atributos (dados)
	
	public String nome;
	public int idade;
	public int setor;
	
	//métodos (ações)
	
	public String resultado() {
		
		String cadastro = ("Seu nome é: "+ nome + "\nSua idade é: "+ idade +"\nSeu setor é: "+ setor);
		return cadastro;
		
	}
}
