package Exercicio03;

public class Main {
    public static void main(String[] args) {
        Tarefas tarefas =  new Tarefas();
        tarefas.adicionarTarefa("1", "10/10/23", "Regar flores");
        tarefas.adicionarTarefa("2", "10/10/23", "Fazer comida");
        tarefas.exibirTarefas();
        tarefas.excluirTarefa("1");
        tarefas.exibirTarefas();
    }
}
