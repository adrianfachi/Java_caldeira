import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos verificar se é possível você comprar um carro");
        System.out.print("Informe a sua idade: ");
        int idade = ler.nextInt();
        System.out.print("Informe o seu salario: ");
        int salario = ler.nextInt();
        if (idade >= 18 & salario > 2000) {
            System.out.println("Você pode comprar um carro!");
        } else {
            System.out.println("Você não pode comprar um carro!");
        }

    }
}
