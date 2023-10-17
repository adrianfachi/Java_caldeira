import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        Random criaNumeros = new Random();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            numeros.add(criaNumeros.nextInt(1,101));
        }


        System.out.println("Digite um número: ");
        if (numeros.contains(scanner.nextInt())){
            System.out.println("Você acertou, o número está entre os números");
        } else {
            System.out.println("Você errou, o número não está entre os números");
        }
    }
}
