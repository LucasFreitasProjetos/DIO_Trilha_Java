package DIO_Trilha_Java.DesafioBanco;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private String nome;
    private final List<Cliente> clientes = new ArrayList<>();
    private final List<Conta> contas = new ArrayList<>();

    public Banco(String nome) {
        this.nome = nome;
    }

    public void cadastrarCliente(Cliente cliente) {
        if (cliente == null || cliente.getNome() == null || cliente.getNome().isBlank()) {
            throw new IllegalArgumentException("Cliente inválido");
        }
        clientes.add(cliente);
    }

    public ContaCorrente abrirContaCorrente(Cliente cliente) {
        cadastrarCliente(cliente);
        ContaCorrente cc = new ContaCorrente(cliente);
        contas.add(cc);
        return cc;
    }

    public ContaPoupanca abrirContaPoupanca(Cliente cliente) {
        cadastrarCliente(cliente);
        ContaPoupanca cp = new ContaPoupanca(cliente);
        contas.add(cp);
        return cp;
    }

    public Conta buscarConta(int agencia, int numero) {
        return contas.stream()
                .filter(conta -> conta.getAgencia() == agencia && conta.getNumero() == numero)
                .findFirst()
                .orElse(null);
    }

    public void imprimirRelatorioContas() {
        System.out.println("=== Relatório de Contas - " + nome + " ===");
        for (Conta conta : contas) {
            System.out.printf("Ag: %d - Nº %d - Cliente: %s - Saldo: R$ %.2f\n", conta.getAgencia(), conta.getNumero(), conta.getCliente().getNome(), conta.getSaldo());
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Banco{" +
                "nome='" + nome + '\'' +
                ", clientes=" + clientes.size() +
                ", contas=" + contas.size() +
                '}';
    }

}
