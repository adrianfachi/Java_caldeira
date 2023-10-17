package Exercicio05;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Impressao fila = new Impressao();
        fila.adicionarDocumentoAFila("aisd", 54);
        fila.adicionarDocumentoAFila("asdfsdf", 32);
        fila.adicionarDocumentoAFila("443tgfd", 5423);
        fila.adicionarDocumentoAFila("aisd", 54);
        fila.lerFila();
    }
}
