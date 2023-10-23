package Exercicio02;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        Pessoas pessoas = new Pessoas();
        pessoas.adicionarPessoa("Adrian", 18);
        pessoas.adicionarPessoa("Gemanir", 45);
        pessoas.adicionarPessoa("Sidnei", 52);
        pessoas.adicionarPessoa("Braz", 76);
        pessoas.adicionarPessoa("Clarice", 65);
        pessoas.pessoasDaTerceiraIdade();
        pessoas.verIdade("Adrian");
    }
}
