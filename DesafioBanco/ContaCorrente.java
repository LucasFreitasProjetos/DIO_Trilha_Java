package DIO_Trilha_Java.DesafioBanco;

public class ContaCorrente extends Conta {

    private final double taxaOperacao = 1.00;

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }
    
    @Override
    public void sacar(double valor) {
        double valorComTaxa = valor + taxaOperacao;
        if (valor <= 0) {
            throw new IllegalArgumentException("Valor de saque deve ser maior que zero");
        }
        if (getSaldo() < valorComTaxa) {
            throw new IllegalArgumentException("Saldo insuficiente para saque + taxa");
        }
        super.sacar(valorComTaxa);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO CONTA CORRENTE ---");
        super.imprimirExtrato();
    }

    public double getTaxaOperacao() {
        return taxaOperacao;
    }

}
