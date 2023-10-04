import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ContaBancaria {
    private String nome;
    private String cpf;
    private String identificadorDeConta;
    private String banco;
    private String endereco;
    private double saldo;
    private String horarioAtual;
    private List<String> historicoTransacoes;

    /*Construtor*/
    public ContaBancaria (String nome, String cpf, String identificadorDeConta, String banco, String endereco) {
        this.nome = nome;
        this.cpf = cpf;
        this.identificadorDeConta = identificadorDeConta;
        this.banco = banco;
        this.endereco = endereco;
        this.saldo = 0;
        this.horarioAtual = getCurrentTime();
        this.historicoTransacoes = new ArrayList<>();
    }

    private String getCurrentTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm");
        Date now = new Date();
        return timeFormat.format(now);
    }

    public void saque(double valor) {
        if (saldo > valor) {
            this.saldo = this.saldo - valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void deposito(double valor) {
        this.saldo = this.saldo + valor;
        historicoTransacoes.add("Deposito no valor de " + valor);
    }
    public void pix(double valor) {
        if (saldo > valor) {
            this.saldo = this.saldo - valor;
            historicoTransacoes.add("PIX efetuado no valor de " + valor);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void transferencia(double valor) {
        if (horarioTransferenciaPermitido()) {
            this.saldo = this.saldo - valor;
            historicoTransacoes.add("Transferência efetuada no valor de " + valor);
        } else {
            System.out.println("Saldo insuficiente ou fora de horário");
        }
    }

    public void verificarSaldo() {
        System.out.println("O saldo da conta é "+ this.saldo);
    }

    public String verificarHorario() {
        return horarioAtual;
    }

    public void verificarInformacoes() {
        System.out.println("O titular da conta é " + this.nome);
        System.out.println("O CPF do titular da conta é " + this.cpf);
        System.out.println("O saldo da conta é " + this.saldo);
        System.out.println("O número da conta é " + this.identificadorDeConta);
        System.out.println("O banco da conta é " + this.banco);
        System.out.println("O endereço cadastrado para essa conta é" + this.endereco);
    }

    public void setCpfSomenteNumeros(String cpf) {
        if (cpf.length() == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF inválido");
        }
    }

    private boolean horarioTransferenciaPermitido() {
        String[] parts = horarioAtual.split(":");
        int hour = Integer.parseInt(parts[0]);
        return hour >= 8 && hour <= 19;
    }

    public void exibirHistoricoTransacoes() {
        System.out.println("Histórico de Transações:");
        for (String transacao : historicoTransacoes) {
            System.out.println(transacao);
        }
    }

    public void alterarEndereco(String newEndereco) {
        this.endereco = newEndereco;
        historicoTransacoes.add("Endereço alterado para: "+ newEndereco);
    }

}
