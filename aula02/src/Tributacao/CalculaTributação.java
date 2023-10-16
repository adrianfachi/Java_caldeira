package Tributacao;

public class CalculaTributação {

    double totalTributação;

    public void registra(Conta c) {
        double valor = c.calculaTributos();
        totalTributação += valor;
    }

    public double getTotalTributação() {
        return totalTributação;
    }
}
