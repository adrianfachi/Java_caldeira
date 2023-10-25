package Exercicio04;

public class Calculadora implements Calculavel{
    @Override
    public int adicionar(int n1, int n2) {
        return n1 + n2;
    }

    @Override
    public int subtrair(int n1, int n2) {
        return n1 - n2;
    }

    @Override
    public int multiplicar(int n1, int n2) {
        return n1 * n2;
    }

    @Override
    public int dividir(int n1, int n2) {
        return n1 / n2;
    }
}
