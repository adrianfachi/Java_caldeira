package Tributacao;

public class ContaCorrente extends Conta implements Tributavel{

    private boolean seguroDeVida = false;

    public void criarSeguroDeVida() {
        this.seguroDeVida = true;
    }
    @Override
    public double calculaTributos() {
        if (seguroDeVida) {
            return super.obterSaldo()*0.01 + 42;
        } else {
            return super.obterSaldo()*0.01;
        }
    }
}
