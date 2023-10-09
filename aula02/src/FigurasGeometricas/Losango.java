package FigurasGeometricas;

import FigurasGeometricas.FigurasGeometricas;

public class Losango extends FigurasGeometricas {
    public Losango(double diagonal1, double diagonal2){
        super.altura = diagonal1;
        super.base = diagonal2;
    }
    @Override
    public void calcularArea() {
        System.out.println("A área do losango é " + super.altura*super.base/2);
    }
}
