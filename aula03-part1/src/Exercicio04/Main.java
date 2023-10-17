package Exercicio04;

public class Main {
    public static void main(String[] args) {
        Compra lista = new Compra();
        lista.adicionarItem("arroz", "10/11/23");
        lista.adicionarItem("feijão", "10/12/23");
        lista.verLista();
        lista.excluirItem("feijão");
        System.out.println("-----------------");
        lista.verLista();
    }
}
