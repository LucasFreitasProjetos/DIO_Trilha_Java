package DIO_Trilha_Java.DesafioBanco;

public abstract class Conta implements IConta {

    protected static final int AGENCIA_PADRAO = 1;
    protected static int SEQUENCIAL = 1;

    private int agencia;
    private int numero;
    private double saldo;
    private Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
        this.saldo = 0;
    }


    @Override
    public void sacar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero");
        }
        if (saldo < valor) {
            throw new IllegalArgumentException("Saldo insuficiente");
        }
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de depósito deve ser maior que zero");
        }
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        if (contaDestino == null) {
            throw new IllegalArgumentException("Conta destino inválida");
        }
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO ---");
        System.out.println("Cliente: " + cliente.getNome());
        System.out.println("Agência: " + agencia);
        System.out.println("Conta: " + numero);
        System.out.println("Saldo: R$ " + String.format("%.2f", saldo));
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public String toString() {
        return String.format("Conta{agencia=%d, numero=%d, saldo=%.2f, cliente=%s}", agencia, numero, saldo, cliente != null ? cliente.getNome() : "-");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Conta conta = (Conta) o;
        return agencia == conta.agencia && numero == conta.numero;
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(agencia, numero);
    }

}

