import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int hora, minuto, segundo;

        System.out.println("Por favor, digite a hora: ");
        hora = ler.nextInt();

        System.out.println("Por favor, digite o minuto: ");
        minuto = ler.nextInt();

        System.out.println("Por favor, digite o segundo: ");
        segundo = ler.nextInt();

        int passouDaMeiaNoite = hora * 3600 + minuto * 60 + segundo;
        int faltaParaMeiaNoite = 86400 - passouDaMeiaNoite;
        if (hora >=0 && hora<24 && minuto>=0 && minuto<60 && segundo>=0 && segundo<60) {
            System.out.println("Faltam " + faltaParaMeiaNoite + " segundos para meia noite");
            System.out.println("Já se passaram " + passouDaMeiaNoite + " segundos hoje!");
        } else {
            System.out.println("Horário inválido");
        }
        ler.close();
    }
}
