import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner menu = new Scanner(System.in);
        int opcao = 0;
        int i = 0;

        while(i != 2) {
            if (opcao != 1 & opcao != 2 & opcao != 3 & opcao != 4) {
                if (i == 1) {
                    System.out.println("-----------------------------------------------");
                    System.out.println("Por favor, escreva uma opção entre 1, 2, 3 ou 4");
                }

                if (i == 0) {
                    System.out.println("---------Menu----------");
                    System.out.println("Opção 1: Gestante");
                    System.out.println("Opção 2: Idosa");
                    System.out.println("Opção 3: PCD");
                    System.out.println("Opção 4: Nenhuma das opções");
                }

                System.out.print("Escolha uma opção: ");
                opcao = menu.nextInt();
                i = 1;
            } else {
                i = 2;
            }
        }

        if (opcao != 1 && opcao != 2 && opcao != 3) {
            System.out.println("Você não tem direito à fila prioritária");
        } else {
            System.out.println("Você tem direito à fila prioritária");
        }

    }
}
