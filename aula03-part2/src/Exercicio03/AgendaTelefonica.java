package Exercicio03;

public class AgendaTelefonica {
    private String telefone;
    private String nome;
    private String local;

    public AgendaTelefonica (String telefone, String nome, String local) {
        this.telefone = telefone;
        this.nome = nome;
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public String getNome() {
        return nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public int compare(AgendaTelefonica o1, AgendaTelefonica o2) {
        return o1.getNome().compareTo(o2.getNome());
    }
    public void imprimirNomeTelefone () {
        System.out.println("O número de telefone " + telefone + " é do(a) " + nome);
    }
}
