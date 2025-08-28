package entities;

public class deposito {
	
	private int numconta;
	private String nome;
	private double saldoconta;
	
	public deposito(int numconta, String nome, double depositoinicial) {
		this.numconta = numconta;
		this.nome = nome;
		addSaldo(depositoinicial);
	}
	//construtor
	public deposito(int numconta, String nome) {
		this.numconta = numconta;
		this.nome = nome;
	}
	
	//metodos
	public void addSaldo(double deposit) {
		this.saldoconta += deposit;
	}
	
	public void revomeSaldo(double saque) {
		this.saldoconta = saldoconta - (saque + 5);
	}
	
	//gets
	public int getNumconta() {
		return numconta;
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSaldoconta() {
		return saldoconta;
	}
}
