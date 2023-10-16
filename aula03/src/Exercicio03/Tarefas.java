package Exercicio03;


import java.util.*;

public class Tarefas {
    private Map<String, Object> tarefas = new HashMap<>();

    public void adicionarTarefa(String titulo, String data, String descricao) {
        List<String> DataEDescricao = new ArrayList<>();
        DataEDescricao.add("Data: "+ data);
        DataEDescricao.add("Descrição: "+ descricao);
        tarefas.put(titulo, DataEDescricao);
    }

    public void exibirTarefas() {
        for (String key: tarefas.keySet()) {
            System.out.println(key + " = " + tarefas.get(key));
        }
    }

    public void excluirTarefa(String titulo) {
        tarefas.remove(titulo);
    }
}
