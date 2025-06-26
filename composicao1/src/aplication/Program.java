package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.departamento;
import entities.horaContrato;
import entities.trabalho;
import entities.enums.nivelTrabalho;

public class Program {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat d = new SimpleDateFormat("dd/MM/yyy"); //formata a data digitada no contrato
		
       System.out.print("Entre com o departamento: ");
       String departamentoNome = sc.nextLine();
       
       System.out.println("Entre com os dados do trabalhador:");
       
       System.out.print("Nome: ");
       String nomeTrabalhador = sc.nextLine();
       
       System.out.print("Nível: ");
       String nivelTrabalhador = sc.nextLine();
       
       System.out.print("Base salarial: ");
       double baseTrabalhador = sc.nextDouble();
       
       trabalho trabalho = new trabalho(nomeTrabalhador, nivelTrabalho.valueOf(nivelTrabalhador), baseTrabalhador, new departamento(departamentoNome));
       
       System.out.print("Quantos contratos para esse trabalhador?: ");
       int n = sc.nextInt();
       
       for(int i=0; i<n; i++) {
    	   System.out.print("Entre com a data do contrato nº " + (i+1) + " :");
    	   System.out.print("Formato DD/MM/YYY): ");
    	   Date contractDate = d.parse(sc.next());
    	   System.out.print("Valor por hora: ");
    	   double valorPorHora = sc.nextDouble();
    	   System.out.print("Duração de horas: ");
    	   int horas = sc.nextInt();
    	   
    	   horaContrato contrato = new horaContrato(contractDate, valorPorHora, horas); //cria o contrato
    	   trabalho.addContrato(contrato); //insere o contrato na lista da classe trabalho
    	   
       }
       
       System.out.println();
       System.out.print("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
       String mesEano = sc.next();
       int mes = Integer.parseInt(mesEano.substring(0, 2));
       int ano = Integer.parseInt(mesEano.substring(3));
       
       System.out.println("Nome do funcionário: " + trabalho.getNome());
       System.out.println("Departamento: " + trabalho.getDepart().getName());
       System.out.println("A renda do mês " + mesEano + " : " + String.format("%.2f", trabalho.somaSalario(ano, mes)));
       
		
		
		sc.close();

	}

}
