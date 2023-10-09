package FigurasGeometricas;

import FigurasGeometricas.FigurasGeometricas;

public class Quadrado extends FigurasGeometricas {
    public Quadrado(double lado){
        super.lado = lado;
    }
    @Override
    public void calcularArea() {
        System.out.println("A área do quadrado é " + super.lado*super.lado);
    }
}
