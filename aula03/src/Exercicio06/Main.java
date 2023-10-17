package Exercicio06;

import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedList<Reserva> reservas = new LinkedList<>();
        Scanner scan = new Scanner(System.in);

        while (true) {

            System.out.println("-----------Menu-----------");
            System.out.println("Opção 1: adicionar reserva");
            System.out.println("Opção 2: cacelar reserva");
            System.out.println("Opção 3: exibir reservas");
            System.out.println("Opção 4: sair");
            System.out.println("Escolha uma opção: ");
            int menuNumero = scan.nextInt();
            switch (menuNumero) {
                case 1:
                    System.out.println("Digite seu nome: ");
                    String nome = scan.nextLine();
                    nome = scan.nextLine();
                    System.out.println("Digite o local para onde desja ir: ");
                    String local = scan.nextLine();
                    System.out.println("Digite a data de entrada: ");
                    String dataEntrada = scan.nextLine();
                    System.out.println("Digite a data de saída: ");
                    String dataSaida = scan.nextLine();
                    Reserva reserva = new Reserva(nome ,local, dataEntrada,dataSaida);
                    reservas.add(reserva);
                    System.out.println("Reserva concluída");
                    break;
                case 2:
                    System.out.println("Digite o indíce da reserva que desja remover: ");
                    int indice = scan.nextInt()-1;
                    if (indice >= 0 && indice < reservas.size()) {
                        reservas.remove(indice);
                        System.out.println("Reserva cancelada!");
                    } else {
                        System.out.println("Essa reserva não exixte!");
                    }
                    break;
                case 3:
                    if (!reservas.isEmpty()) {
                        System.out.println("Sua lista de reservas: ");
                        for (int i = 0; i < reservas.size(); i++) {
                            System.out.println(i + 1 + " : " + reservas.get(i).exibirReserva());
                        }
                    } else {
                        System.out.println("Sem reservas");
                    }
                    break;
                case 4:
                    System.out.println("Saindo do menu!");
                    scan.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção não encontrada");
            }
        }
    }
}
