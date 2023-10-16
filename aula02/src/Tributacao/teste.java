package Tributacao;

public class teste {
    public static void main(String[] args) {
        Conta conta1 = new ContaCorrente();
        conta1.criarSeguroDeVida();
        conta1.depositar(140);
        System.out.println(conta1.obterSaldo());
        System.out.println(conta1.calculaTributos());

        CalculaTributação calc = new CalculaTributação();
        calc.registra(conta1);

        System.out.println(calc.getTotalTributação());
    }
}
