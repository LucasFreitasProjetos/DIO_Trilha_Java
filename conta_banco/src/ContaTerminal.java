import java.util.Scanner;   

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
        
    System.out.print("Digite o número da conta: ");
        int Numero = scanner.nextInt();
        
    
    System.out.print("Digite o número da agência: ");
        String agencia = scanner.next();
        scanner.nextLine();
    
    System.out.print("Digite o Seu nome : ");
        String nome = scanner.nextLine();
    
    System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();
        
    
    System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + Numero + " e seu saldo " + saldo + " já está disponível para saque.");


    }
}
