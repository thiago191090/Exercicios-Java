import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = 0;
        double resultado = 0;

        while (n != 5) {
            System.out.println("Bem vindo a calculadora do Thiago");
            System.out.println("Escolha a opção desejada abaixo:");
            System.out.println("1 -SOMA\n2- SUBTRAÇÃO\n3- DIVISÃO\n4- MULTIPLICAÇÃO\n5- SAIR");
            System.out.print("Coloque a opção aqui: ");
            n = s.nextInt();
            while (n > 5) {
                System.out.println("Escolha uma opção válida!!");
                System.out.print("Digite novamente aqui:");
                n = s.nextInt();
            }

            if (n == 1) {
                System.out.print("Digite o primeiro número: ");
                double num1 = s.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = s.nextDouble();
                Calculo calc = new Calculo(num1, num2);
                resultado = calc.adicao(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            if (n == 2) {
                System.out.print("Digite o primeiro número: ");
                double num1 = s.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = s.nextDouble();
                Calculo calc = new Calculo(num1, num2);
                resultado = calc.subtracao(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            if (n == 3) {
                System.out.print("Digite o primeiro número: ");
                double num1 = s.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = s.nextDouble();
                Calculo calc = new Calculo(num1, num2);
                resultado = calc.divisao(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            if (n == 4) {
                System.out.print("Digite o primeiro número: ");
                double num1 = s.nextDouble();
                System.out.print("Digite o segundo número: ");
                double num2 = s.nextDouble();
                Calculo calc = new Calculo(num1, num2);
                resultado = calc.multiplicacao(num1, num2);
                System.out.println("Resultado: " + resultado);
            }
            if(n == 5){
                System.out.println("Programa encerrado!");
                System.exit(0);
            }

            System.out.println("Deseja somar, subtrair, multiplicar ou dividir o resultado?");
            System.out.println("0 - NÃO\n1 - SIM");
            System.out.print("Coloque a opção aqui:");
            int j = s.nextInt();
            n = j;
            while (j != 0) {
                System.out.println("Qual operação?\n1 -SOMA\n2- SUBTRAÇÃO\n3- DIVISÃO\n4- MULTIPLICAÇÃO");
                System.out.print("Coloque a opção aqui:");
                int l = s.nextInt();
                if (l > 5 || l == 0) {
                    System.out.println("Valor inválido!!");
                } else {
                    if (l == 1) {
                        System.out.print("Digite o valor a somar:");
                        double num3 = s.nextDouble();
                        Calculo calc2 = new Calculo(resultado, num3);
                        resultado = calc2.adicao(resultado, num3);
                        System.out.println("Resultado: " + resultado);
                    }
                    if (l == 2) {
                        System.out.print("Digite o valor a subtrair:");
                        double num3 = s.nextDouble();
                        Calculo calc2 = new Calculo(resultado, num3);
                        resultado = calc2.subtracao(resultado, num3);
                        System.out.println("Resultado: " + resultado);
                    }
                    if (l == 3) {
                        System.out.print("Digite o valor a dividir:");
                        double num3 = s.nextDouble();
                        Calculo calc2 = new Calculo(resultado, num3);
                        resultado = calc2.divisao(resultado, num3);
                        System.out.println("Resultado: " + resultado);
                    }
                    if (l == 4) {
                        System.out.print("Digite o valor a multiplicar:");
                        double num3 = s.nextDouble();
                        Calculo calc2 = new Calculo(resultado, num3);
                        resultado = calc2.multiplicacao(resultado, num3);
                        System.out.println("Resultado: " + resultado);
                    }
                }
                System.out.println("Deseja sair ou continuar?");
                System.out.println("0 - SAIR\n1 - CONTINUAR");
                System.out.print("Coloque a opção aqui:");
                j = s.nextInt();
            }
        }
        s.close();
    }
}
