package FigurasGeometricas;

public class Circulo extends FigurasGeometricas{
    public Circulo(double raio) {
        super.raio = raio;
    }

    @Override
    public void calcularArea() {
        System.out.println("A área do circulo é " + super.raio*super.raio*Math.PI);
    }
}
