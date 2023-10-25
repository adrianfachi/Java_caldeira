package Exercicio02;

import java.util.Locale;
import java.util.Scanner;

import static Exercicio02.DiaDaSemana.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Escreva um dia da semana: ");
        String diaDaSemana = scan.nextLine().toUpperCase(Locale.ROOT);
        try {
            DiaDaSemana dia = DiaDaSemana.valueOf(diaDaSemana);//Transforma a String em enum
            switch (dia) {
                case SEGUNDA,TERÇA,QUARTA,QUINTA,SEXTA -> System.out.println("Dia de trabalho");
                case SÁBADO,DOMINGO -> System.out.println("É final de semana");
            }
        } catch (Exception e){
            System.out.println("Dia da semana inválido");
        }

         scan.close();
    }
}
