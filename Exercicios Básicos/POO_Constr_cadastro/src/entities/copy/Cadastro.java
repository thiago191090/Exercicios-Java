package entities.copy;

public class Cadastro {
		public String name;
		public String cpf;
		public String rg;
		
		public Cadastro(String name, String cpf, String rg){
			this.name = name;
			this.cpf = cpf;
			this.rg = rg;
		}
		
		public String toString() {
			return "Seu nome é: "
					+ name +
					" Seu CPF é: "
					+ cpf +
					" Seu RG é: "
					+ rg;
		}
}
