package Tributacao;

public class Conta implements Tributavel{
   private double saldo;

    public void depositar(double saldo) {
        this.saldo = saldo;
    }
    public void sacar(double valor) {
        if (saldo > valor) {
            this.saldo -= valor;
        }else {
            System.out.println("Saldo insuficiente");
        }
    }

    public double obterSaldo() {
        return saldo;
    }


    @Override
    public double calculaTributos() {
        return 0;
    }
    public void criarSeguroDeVida() {}
}

