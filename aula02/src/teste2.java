public class teste2 {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(12);
        Circulo circulo2 = new Circulo(10);
        circulo1.calcularArea();
        circulo1.calcularCircunferencia();
        String string = circulo2.toString();
        System.out.println(string);
    }
}
