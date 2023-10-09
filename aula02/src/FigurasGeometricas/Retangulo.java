package FigurasGeometricas;

import FigurasGeometricas.FigurasGeometricas;

public class Retangulo extends FigurasGeometricas {
    public Retangulo(double altura, double base){
        super.base = base;
        super.altura = altura;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do retangulo é " + super.altura*super.base);
    }
}
