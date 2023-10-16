package Exercicio04;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Compra {
    private Map<String, String> lista= new HashMap<>();

    public void adicionarItem (String nome, String validade) {
        lista.put(nome.toUpperCase(), "Validade: " +validade);
    }

    public void verLista() {
        for (String key : lista.keySet()) {
            System.out.println(key + " = " + lista.get(key));
        }
    }

    public void excluirItem(String nome) {
        lista.remove(nome.toUpperCase());
    }
}
