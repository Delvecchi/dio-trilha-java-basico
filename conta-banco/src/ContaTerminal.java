import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        
    
        Scanner scannerConta = new Scanner(System.in);
        System.out.print("Por favor digite o número de sua conta: ");
        int numeroConta = scannerConta.nextInt(); 
        
        Scanner scannerAgencia = new Scanner(System.in);
        System.out.print("Por favor digite a sua ágencia: ");
        String agencia = scannerAgencia.nextLine();
        
        Scanner scannerCliente = new Scanner(System.in);
        System.out.print("Por favor digite o nome do titular da conta: ");
        String nomeCliente = scannerCliente.nextLine();

        Scanner scannerSaldo = new Scanner(System.in);
        System.out.print("Por favor digite o saldo da conta: ");
        double saldo = scannerSaldo.nextDouble();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " 
        + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque.");

    }
}
