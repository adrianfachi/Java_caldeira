public class Circulo {
    private double raio;

    public Circulo (double raio) {
        definirRaio(raio);
    }

    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                ", área=" + calcularArea() +
                ", circunferência=" + calcularCircunferencia() +
                '}';
    }
    public double calcularArea() {
        double area = Math.PI * raio * raio;
        System.out.println("A área do circulo é " + area);
        return area;
    }

    public double calcularCircunferencia() {
        double circunferencia = Math.PI * raio * 2;
        System.out.println("A circunferência do circulo é " + circunferencia);
        return circunferencia;
    }
    public void definirRaio(double novoRaio) {
        if (novoRaio > 0) {
            this.raio = novoRaio;
        } else {
            System.out.println("Defina um raio maior que 0");
        }
    }

    public double getRaio() {
        return raio;
    }

    public void calcularSobraDeArea (Circulo circulo1, Circulo circulo2) {
        if (circulo1.getRaio() == circulo2.getRaio()) {
            System.out.println("Os circulos são iguais");
        } else if (circulo1.getRaio() > circulo2.getRaio()){
            double sobra = circulo1.calcularArea() - circulo2.calcularArea();
            System.out.println("A sobra de área do circulo maior sobre o circulo menor é " + sobra);
        } else {
            double sobra = circulo2.calcularArea() - circulo1.calcularArea();
            System.out.println("A sobra de área do circulo maior sobre o circulo menor é " + sobra);
        }
    }

    public void criaCirculoComPontos(double x1, double x2, double y1, double y2) {
        double novoRaio = Math.sqrt((x1 - x2)*(x1 - x2) + (y1 - y2)*(y1 -y2));
        this.raio = novoRaio;
        System.out.println("O raio dessa circunferência é " + novoRaio);
    }

}
