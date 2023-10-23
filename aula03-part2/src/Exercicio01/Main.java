package Exercicio01;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Livro> listaDeLivros = new Stack<>();
        Scanner scan = new Scanner(System.in);

        Livro livro1 = new Livro("Jogos Vorazes", "Ficcção científica");
        Livro livro2 = new Livro("A culpa é das estrelas", "Romance");
        Livro livro3 = new Livro("Orgulho e preconceito", "Romance");
        Livro livro4 = new Livro("A ilha do tesouro", "Aventura");
        Livro livro5 = new Livro("Interestelar", "Ficção científica");
        Livro livro6 = new Livro("Arsène Lupin, Ladrão de Casaca", "Mistério");
        listaDeLivros.add(livro1);
        listaDeLivros.add(livro2);
        listaDeLivros.add(livro3);
        listaDeLivros.add(livro4);
        listaDeLivros.add(livro5);
        listaDeLivros.add(livro6);

        while (true) {
            System.out.println("1- Imprimir todos os livros da biblioteca");
            System.out.println("2- Imprimir com base na categoria ");
            System.out.println("3- Remover um  livro");
            System.out.println("4- Remover livros até que a biblioteca  esteja vazia");
            System.out.println("5- Sair");

            int escolha = scan.nextInt();
            switch (escolha) {
                case 1:
                    System.out.println("-------------------------------------------");
                    for (int i = 0; i < listaDeLivros.size(); i++) {
                        System.out.println("Nome: " + listaDeLivros.get(i).getTitulo());
                        System.out.println("Categoria: " + listaDeLivros.get(i).getCategoria());
                        System.out.println("-------------------------------------------");
                    }
                    break;
                case 2:
                    for (int i = 0; i < listaDeLivros.size(); i++) {
                        System.out.println("Categoria: " + listaDeLivros.get(i).getCategoria());
                    }
                    break;
                case 3:
                    if (!listaDeLivros.isEmpty()) {
                        Livro livroRemovido = listaDeLivros.pop();
                        System.out.println("Livro removido: " + livroRemovido.getTitulo());
                    } else {
                        System.out.println("Biblioteca vazia! ");
                    }
                    break;
                case 4:
                    for (int i = 0; i < listaDeLivros.size();) {
                        listaDeLivros.pop();
                    }
                    System.out.println("Biblioteca de livros esvaziada com sucesso!");
                case 5:
                    System.out.println("Saindo do menu!");
                    scan.close();
                    System.exit(0);
                default:
                    System.out.println("Opção errada!");
            }
            System.out.println("Deseja continuar? Se SIM digite 1, se NÃO digite 2");
            int continua = scan.nextInt();
            if (continua != 1) {
                scan.close();
                System.exit(0);
            }
        }
    }
}
