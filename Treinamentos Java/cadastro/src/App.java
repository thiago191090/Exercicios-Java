import java.util.ArrayList;
import java.util.Scanner;
import classes.Cliente;

public class App {
    
    public static void main(String[] args) throws Exception {
        //inicia a variável para receber as entradas
        Scanner sc = new Scanner(System.in);
        
        //cria a lista de objetos clientes vazia
        ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();
       
        //variável para iniciar o laço while
        int c = 0;

        //laço de cadastro de clientes
        while (c != 1){
        System.out.println("Vamos iniciar o cadastro do cliente!");
        System.out.println();

        System.out.println("Digite o nome do cliente: ");
        String nome = sc.next();
        sc.nextLine();
        System.out.println();

        System.out.println("Digite a idade do cliente: ");
        int idade = sc.nextInt();
        System.out.println();

        System.out.println("Digite o seu telefone: ");
        String telefone = sc.next();
        
        //Caso digite menos ou mais caracteres do telefone
        int quanttel = telefone.length();
        while (quanttel <= 8 || quanttel > 9) {
            System.out.println("Digite um telefone válido: ");
            String tel = sc.next();
            quanttel = tel.length();
            telefone = tel;
        }

        //printa os dados recebidos
        System.out.println();
        System.out.println(
                "O cliente " + nome + ", com " + idade + " de idade, e com o telefone: " + telefone + " foi criado!");

        //instancia o objeto e inclui na lista
        Cliente cliente = new Cliente(nome, idade, telefone);
        listaClientes.add(cliente);

        //opção para incluir mais um cliente, ou seguir em frente
        System.out.println("Deseja cadastrar mais um cliente? 0 = (Sim) ou 1 = (Não)");
        c = sc.nextInt();
        System.out.println();

        }
        
        //opção para alterar dados do cliente
        System.out.println("Deseja fazer alguma alteração nos clientes? 0 = (Sim) e 1 = (Não)");
        int alteracao = sc.nextInt();

        if(alteracao == 0){
            
           int cont = 1;

        while (cont != 0) {

            for(int i = 0; i < listaClientes.size(); i++){
                Cliente lista = listaClientes.get(i);
                System.out.println("ID: "+ i +" "+ lista.toString());
                System.out.println();
            }
            
            System.out.println("Digite o ID do cliente que deseja alterar: ");
            int p = sc.nextInt();

            listaClientes.get(p).toString();
            
            System.out.println();
            System.out.println("O que deseja alterar no cliente: ");
            System.out.println();
            System.out.println("-Para alterar o nome, digite (1)");
            System.out.println("-Para alterar a idade, digite (2)");
            System.out.println("-Para alterar o telefone, digite (3)");
            System.out.println();
            System.out.println("-Ou, para sair, digite (0).");
            cont = sc.nextInt();

            if (cont == 1) {
                System.out.println("Digite o nome que deseja alterar: ");
                String n = sc.next();
                listaClientes.get(p).setNome(n);
            }
            if (cont == 2) {
                System.out.println("Digite a idade que deseja alterar: ");
                int i = sc.nextInt();
                listaClientes.get(p).setIdade(i);
            }
            if (cont == 3) {
                System.out.println("Digite o telefone que deseja alterar: ");
                String t = sc.next();
                String verificartel = String.valueOf(t);
                int quanttel = verificartel.length();
                while (quanttel <= 8) {
                    System.out.println("Digite um telefone válido: ");
                    t = sc.next();
                    verificartel = String.valueOf(t);
                    quanttel = verificartel.length();
                }
                listaClientes.get(p).setTelefone(t);
            }
            if (cont >= 4) {
                System.out.println("Digite uma opção válida!");
            }
            System.out.println();
            System.out.println(listaClientes.get(p).toString());
            System.out.println();
            System.out.println("Deseja sair?");
            cont = sc.nextInt();

        } 
        } else{
            System.out.println("Programa encerrado!");
        }
        System.out.println("Programa encerrado!");
        sc.close();
    }

}
