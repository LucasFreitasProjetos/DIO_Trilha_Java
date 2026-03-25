package DIO_Trilha_Java.DesafioBanco;

public class ContaPoupanca extends Conta {

    private final double rendimentoMensal = 0.005; // 0,5%

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void render() {
        double valorRendimento = getSaldo() * rendimentoMensal;
        depositar(valorRendimento);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("--- EXTRATO CONTA POUPANÇA ---");
        super.imprimirExtrato();
    }

}
