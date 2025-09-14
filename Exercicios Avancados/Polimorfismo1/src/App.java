import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Funcionarios;
import entidades.FuncionariosTerceirizados;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Funcionarios> contas = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos funcionários deseja cadastrar? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Funcionário "+i+" é terceirizado? ");
            char r = sc.next().charAt(0);
                System.out.print("Nome: ");
                String nome = sc.next();
                System.out.print("Horas: ");
                Integer horas = sc.nextInt();
                System.out.print("Valor por horas: ");
                Double valorHoras = sc.nextDouble();
                if(r == 'S'){
                System.out.print("Adicional: ");
                Double adicional = sc.nextDouble(); 
                contas.add(new FuncionariosTerceirizados(nome, horas, valorHoras, adicional));
                }else{
                contas.add(new Funcionarios(nome, horas, valorHoras));
                }          
        }
        System.out.println("Funcionários e pagamentos: ");
        for(Funcionarios func : contas){
            System.out.println("Funcionário: "+ func.getNome() + " - " + "Pagamento: " + func.pagamento());
        }
        sc.close();
    }
}
