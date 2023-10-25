package Exercicio03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TratamentoDeErros {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um número inteiro");
        try {
            int num = scan.nextInt();
            System.out.println("Você digitou o número "+num);
        } catch (InputMismatchException e) {
            System.out.println("Isso não é um número inteiro");
        }

    }
}
