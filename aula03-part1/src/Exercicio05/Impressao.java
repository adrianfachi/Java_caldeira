package Exercicio05;


import java.util.LinkedList;
import java.util.Scanner;

public class Impressao {

    //Crie um programa Java que simule um sistema de fila de impressão. O programa deve permitir que os usuários adicionem documentos à fila de impressão e, em seguida, imprimir documentos da fila. Use uma LinkedList para representar a fila de impressão. Impressão deve ser uma classe do seu código com os atributos: nome e numero de páginas e métodos que você julgue necessários.

    LinkedList<String> fila = new LinkedList<>();
    Scanner scan = new Scanner(System.in);

    public void adicionarDocumentoAFila(String nome, int numPaginas) {
        fila.add("O documento tem nome " + nome +  " e " + numPaginas + " páginas");
    }

    public void lerFila() {
        System.out.println(fila.poll());
        System.out.println("Deseja continuar vendo a fila? Se SIM digite 1, se NÃO digite 2");
        for (int i = 0; i < fila.size();) {
            if (scan.nextInt() == 1) {
                System.out.println(fila.poll());
            }
        }
    }

    public void lerTodaFila() {
        for (int i = 0; i < fila.size(); i++) {
            System.out.println(fila.get(i));
        }
    }
}
