package Exercicio06;

public class Reserva {
    private String nome;
    private String local;
    private String dataEntrada;
    private String dataSaida;

    public Reserva (String nome, String local, String dataEntrada, String dataSaida) {
        this.nome = nome;
        this.local = local;
        this.dataEntrada = dataEntrada;
        this.dataSaida = dataSaida;
    }

    public String exibirReserva() {
        return nome + " reservou em " + local + " do dia " + dataEntrada + " até " + dataSaida;
    }

    public void menu() {
        System.out.println("-----------Menu-----------");
        System.out.println("Opção 1: adicionar reserva");
        System.out.println("Opção 2: cacelar reserva");
        System.out.println("Opção 3: exibir reservas");
        System.out.println("Opção 4: sair");
    }
}
