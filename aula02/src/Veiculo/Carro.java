package Veiculo;

import Veiculo.Veiculo;

public class Carro extends Veiculo {
    public void calcularCustoViagem(int distancia){
        System.out.println("O custo de viagem é R$" + 0.2*distancia );
    }
}
