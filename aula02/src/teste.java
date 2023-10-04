public class teste {
    public static void main(String[] args) {
        ContaBancaria adrian = new ContaBancaria("Adrian Fachi", "03533470008", "1", "Sicredi", "Ilópolis");
        adrian.deposito(500);
        adrian.saque(600);
        adrian.alterarEndereco("Rua Hermínio Guilherme Bozzetto, 890, Ilópolis");
        adrian.exibirHistoricoTransacoes();
    }
}
