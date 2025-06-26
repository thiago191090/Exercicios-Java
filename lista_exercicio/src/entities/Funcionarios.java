package entities;

public class Funcionarios {
	
	private Integer id;
	private String name;
	private Double salario;
	
	
	public Funcionarios(Integer id, String name, Double salario) {
		super();
		this.id = id;
		this.name = name;
		this.salario = salario;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Double getSalario() {
		return salario;
	}


	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	public void acrescentarSalario(double aumentosalario) {
		salario = salario + salario * aumentosalario / 100.0; 
	}


	@Override
	public String toString() {
		return  id + " , " + name + " , " + salario;
	}
	
	
	
	

}
