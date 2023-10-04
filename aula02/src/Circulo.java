public class Circulo {
    private double raio;

    public void calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("A área do circulo é " + area);
    }

    public void calcularCircunferencia() {
        double circunferencia = Math.PI * raio * 2;
        System.out.println("A circunferência do circulo é " + circunferencia);
    }
    public void definirRaio(double raio) {
        this.raio = raio;
    }
}
