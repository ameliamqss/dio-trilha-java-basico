import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numero;
        String agencia, nomeCliente;
        double saldo;
        Scanner sc = new Scanner(System.in);

        System.out.println("Por favor, digite o número da conta: ");
        numero= sc.nextInt();
        sc.nextLine(); // Limpa o buffer do scanner

        System.out.println("Por favor, digite o número da agencia: ");
        agencia = sc.nextLine();

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo: ");
        saldo = sc.nextDouble();

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "+
        agencia+", conta " + numero+ " e seu saldo " + saldo +" já está disponível para saque");
    }
}
