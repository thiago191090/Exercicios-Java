package entities;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import entities.enums.nivelTrabalho;

public class trabalho {
	
	private String nome;
	private nivelTrabalho nivel;
	private Double baseSalario;
	
	private departamento depart;
	private List<horaContrato> contratos = new ArrayList<>(); //tem que iniciar a lista instanciada
	
	public trabalho() {
		
	}

	public trabalho(String nome, nivelTrabalho nivel, Double baseSalario, departamento depart) {
		this.nome = nome;
		this.nivel = nivel;
		this.baseSalario = baseSalario;
		this.depart = depart;
		this.contratos = contratos;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public nivelTrabalho getNivel() {
		return nivel;
	}

	public void setNivel(nivelTrabalho nivel) {
		this.nivel = nivel;
	}

	public Double getBaseSalario() {
		return baseSalario;
	}

	public void setBaseSalario(Double baseSalario) {
		this.baseSalario = baseSalario;
	}

	public departamento getDepart() {
		return depart;
	}

	public void setDepart(departamento depart) {
		this.depart = depart;
	}

	public void addContrato(horaContrato contrato) { //adiciona um contrato na lista contratos
		contratos.add(contrato);
	}
	
	public void removeContrato(horaContrato contrato) { //remove um contrato na lista contratos
		contratos.remove(contrato);
	}
	
	public double somaSalario(int ano, int mes) {
		double soma = baseSalario;
		Calendar cal = Calendar.getInstance();
		for (horaContrato contr : contratos) {
			cal.setTime(contr.getData());
			
			int contr_ano = cal.get(Calendar.YEAR);
			int contr_mes = 1 + cal.get(Calendar.MONTH);
			
			if (ano == contr_ano && mes == contr_mes) {
				soma += contr.valorTotal();
			}	
		}
		return soma;
	}
	

}
