package Exercicio02;

import java.util.HashMap;

public class Pessoas {
    private HashMap<String, Integer> pessoas = new HashMap<>();

    public void adicionarPessoa(String nome, int idade) {
        pessoas.put(nome, idade);
    }

    public void verIdade(String nome) {
        if (pessoas.containsKey(nome)) {
            System.out.println("Essa pessoa tem " + pessoas.get(nome)+ " anos");
        } else {
            System.out.println("Pessoa não cadastrada!");
        }
    }

    public void pessoasDaTerceiraIdade () {
        for (String key : pessoas.keySet()) {
            if (pessoas.get(key) >= 60) {
                System.out.println(key + " tem " + pessoas.get(key) + " anos e é da terceira idade.");
            }
        }
    }
}
