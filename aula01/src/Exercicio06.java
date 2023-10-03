import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        if (idade < 16) {
            System.out.println("Não pode votar");
        } else if (!(idade < 18) && idade <= 65) {
            System.out.println("O voto é obrigatório");
        } else {
            System.out.println("O voto é facultativo");
        }

    }
}
