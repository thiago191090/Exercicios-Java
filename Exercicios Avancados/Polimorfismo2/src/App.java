import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidades.ProdutoImportado;
import entidades.ProdutoUsado;
import entidades.Produtos;

public class App {
    public static void main(String[] args) throws Exception {

        List<Produtos> produtos = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite quantos produtos quer cadastrar: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.print("Produto Novo (n), Importado (i), ou Usado (u)? ");
            char r = sc.next().charAt(0);
            System.out.print("Nome produto: ");
            String nome = sc.next();
            System.out.print("Preço: ");
            double preco = sc.nextDouble();
            if(r == 'n'){
                produtos.add(new Produtos(nome, preco));
            }else if  (r == 'i') {
                System.out.print("Imposto: ");
                double imposto = sc.nextDouble();
                produtos.add(new ProdutoImportado(nome, preco, imposto));
            }else{
                System.out.print("Data (DD/MM/AAAA): ");
                String data = sc.next();
                produtos.add(new ProdutoUsado(nome, preco, data));
            }
        }
        System.out.println("Produtos e Tickets: ");
        for (Produtos produto : produtos) {
                System.out.println(produto.ticketFinal());
        }

        sc.close();
    }
}
