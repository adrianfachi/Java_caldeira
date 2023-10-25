package Exercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        Scanner scan = new Scanner(System.in);
        String operacao = null;
        System.out.println("Digite a operação que deseja fazer: ");
        try  {
            operacao = scan.nextLine().toUpperCase();
        } catch (Exception e) {
            System.out.println("Isso não é uma operação");
        }
        Operacoes operacaoEnum = Operacoes.valueOf(operacao);

        int num1 = 0;
        int num2 = 0;
        System.out.println("Digite 2 números inteiros para calcular: ");
        try {
            num1 = scan.nextInt();
            num2 = scan.nextInt();
        } catch (Exception e) {
            System.out.println("Isso não é um número inteiro");
        }

        switch (operacaoEnum) {
            case DIVIDIR -> System.out.println(calculadora.dividir(num1, num2));
            case SUBTRAIR -> System.out.println(calculadora.subtrair(num1, num2));
            case ADICIONAR -> System.out.println(calculadora.adicionar(num1, num2));
            case MULTIPLICAR -> System.out.println(calculadora.multiplicar(num1, num2));
        }

    }
}
