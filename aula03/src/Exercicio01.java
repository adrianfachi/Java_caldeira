import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        List<Double> numeros = new ArrayList<>();
        double soma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite um número: ");
            numeros.add(scanner.nextDouble());
        }
        for (int i = 0; i < numeros.size(); i++) {
            soma += numeros.get(i);
        }
        double media = soma/ numeros.size();
        System.out.println("A média dos números digitados é: " + media);
    }
}
