package DIO_Trilha_Java.DesafioBanco;

public class Main {

    public static void main(String[] args) {
        Banco banco = new Banco("Banco DIO");

        Cliente lucas = new Cliente();
        lucas.setNome("Lucas");

        Cliente maria = new Cliente();
        maria.setNome("Maria");

        ContaCorrente ccLucas = banco.abrirContaCorrente(lucas);
        ContaPoupanca cpMaria = banco.abrirContaPoupanca(maria);

        ccLucas.depositar(1000);
        cpMaria.depositar(1500);

        ccLucas.transferir(200, cpMaria);

        try {
            ccLucas.sacar(500);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro ao sacar: " + e.getMessage());
        }

        cpMaria.render();

        banco.imprimirRelatorioContas();

        System.out.println(ccLucas);
        System.out.println(cpMaria);
        System.out.println(banco);

        ccLucas.imprimirExtrato();
        cpMaria.imprimirExtrato();
    }

}
