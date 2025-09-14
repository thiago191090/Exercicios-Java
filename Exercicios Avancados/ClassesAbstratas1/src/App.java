import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.Contribuinte;
import entidades.PessoaFisica;
import entidades.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        List<Contribuinte> contribuintes = new ArrayList<>();

        System.out.print("Quantos contribuintes quer inserir? ");
        int n = sc.nextInt();

        for(int i = 1; i <= n; i++){
            System.out.print("Qual o tipo de contribuinte? F ou J: ");
            char tipo = sc.next().charAt(0);
            System.out.print("Nome: ");
            String nome = sc.next();
            System.out.print("Renda anual: ");
            double rendaanual = sc.nextDouble();
            if(tipo == 'F'){
                System.out.print("Gasto com saúde: ");
                double gastosaude = sc.nextDouble();
                contribuintes.add(new PessoaFisica(nome, rendaanual, gastosaude));
            } else{
                System.out.print("Número de funcionários: ");
                double nunfunc = sc.nextDouble();
                contribuintes.add(new PessoaJuridica(nome, rendaanual, nunfunc));
            }
        }

        for(Contribuinte cont :contribuintes){
            System.out.println("Nome: " + cont.getNome() + " $ " + cont.taxa());
        }

        sc.close();
    }
}
