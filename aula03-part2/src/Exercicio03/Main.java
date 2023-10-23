package Exercicio03;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        List<AgendaTelefonica> agenda = new ArrayList<>();

        AgendaTelefonica contato1 = new AgendaTelefonica("51234323435", "Adrian", "Sul");
        AgendaTelefonica contato2 = new AgendaTelefonica("26343743626", "Joana", "Norte");
        AgendaTelefonica contato3 = new AgendaTelefonica("51234323243", "Ronaldo", "Oeste");
        AgendaTelefonica contato4 = new AgendaTelefonica("34534343434", "João", "Leste");
        AgendaTelefonica contato5 = new AgendaTelefonica("34234345455", "Maria", "Leste");
        AgendaTelefonica contato6 = new AgendaTelefonica("54332356445", "Carlos", "Sul");
        agenda.add(contato1);
        agenda.add(contato2);
        agenda.add(contato3);
        agenda.add(contato4);
        agenda.add(contato5);
        agenda.add(contato6);
        Map<String, String> lista = Stream.of(
                        new AbstractMap.SimpleEntry<>(contato1.getNome(), contato1.getTelefone()),
                        new AbstractMap.SimpleEntry<>(contato2.getNome(), contato2.getTelefone()),
                        new AbstractMap.SimpleEntry<>(contato3.getNome(), contato3.getTelefone()),
                        new AbstractMap.SimpleEntry<>(contato4.getNome(), contato4.getTelefone()),
                        new AbstractMap.SimpleEntry<>(contato5.getNome(), contato5.getTelefone()),
                        new AbstractMap.SimpleEntry<>(contato6.getNome(), contato6.getTelefone()))
                .sorted(Map.Entry.comparingByKey())
                .collect(Collectors.toMap(Map.Entry::getKey,
                        Map.Entry::getValue,
                        (oldVal, newValue) -> oldVal,
                        LinkedHashMap::new));
        System.out.println("Opção 1: Imprimir lista de contatos em ordem alfabética");
        System.out.println("opção 2: Imprimir lista de contatos com base no local");
        System.out.println("Opção 3: Sair");
        int opcao = scan.nextInt();
        switch (opcao) {
            case 1:
                for (String key : lista.keySet()) {
                    System.out.println("O telefone " + lista.get(key) + "é do(a) " + key);
                }
                break;
            case 2:
                for (int i = 0; i < agenda.size(); i++) {
                    if (agenda.get(i).getLocal() == "Sul") {
                        System.out.println("Região sul: ");
                        agenda.get(i).imprimirNomeTelefone();
                        System.out.println("-------------------");
                    } else if (agenda.get(i).getLocal() == "Oeste") {
                        System.out.println("Região oeste: ");
                        agenda.get(i).imprimirNomeTelefone();
                        System.out.println("-------------------");
                    } else if (agenda.get(i).getLocal() == "Norte") {
                        System.out.println("Região norte: ");
                        agenda.get(i).imprimirNomeTelefone();
                        System.out.println("-------------------");
                    } else if (agenda.get(i).getLocal() == "Leste") {
                        System.out.println("Região leste: ");
                        agenda.get(i).imprimirNomeTelefone();
                        System.out.println("-------------------");
                    }
                }
                break;
            case 3:
                System.out.println("Saindo do menu!");
                scan.close();
                System.exit(0);
            default:
                throw new IllegalStateException("Opção invalida");
        }
    }
}
