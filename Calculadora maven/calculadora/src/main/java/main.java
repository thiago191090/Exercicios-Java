import Classes.CalculadoraJava;

import java.util.Scanner;

public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);

    System.out.println("Digite o primeiro número do cálculo: ");
    int num1 = ler.nextInt();

    System.out.println("Digite a operação desejada: ");
    String operacao = ler.next();

    while(!operacao.equals("+") && !operacao.equals("-") && !operacao.equals("*") && !operacao.equals("/")){
        System.out.println("Valor incorreto, digite novamente!");
        System.out.println("Digite a operacao desejada: ");
        operacao = ler.next();
    }

    System.out.println("Digite o segundo número do cálculo");
    int num2 = ler.nextInt();

    CalculadoraJava calculadora = new CalculadoraJava(num1, num2);

    if(operacao.equals("+")){
       int resultado = calculadora.Soma(num1, num2);
       System.out.println("Resultado: " + resultado);
    }
    else if(operacao.equals("-")){
        int resultado = calculadora.Subtracao(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
    else if(operacao.equals("*")){
        int resultado = calculadora.Multiplicacao(num1, num2);
        System.out.println("Resultado: " + resultado);
    }
    else if(operacao.equals("/")){
        int resultado = calculadora.Divisao(num1, num2);
        System.out.println("Resultado: " + resultado);
    }


}