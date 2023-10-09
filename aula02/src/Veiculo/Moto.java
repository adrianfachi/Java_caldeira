package Veiculo;

import Veiculo.Veiculo;

public class Moto extends Veiculo {
    public void calcularCustoViagem(int distancia){
        System.out.println("O custo de viagem é R$" + 0.15*distancia );
    }
}
