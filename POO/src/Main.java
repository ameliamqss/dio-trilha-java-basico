import java.util.Scanner;

class ContaBancaria {
    private int numero;      
    private String titular;  
    private double saldo;    

    public ContaBancaria(int numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        
    }

    // Método para realizar depósito
    public void depositar(double valor) {
        if (valor <= 0) { // Verifica se o valor do depósito é inválido
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            return; // Interrompe a execução e não realiza o depósito
        }
        saldo += valor; // Atualiza o saldo apenas se o depósito for válido
    }
 
    public void exibirSaldo() {
        System.out.printf("Conta #%d - Titular: %s - Saldo: R$%.2f%n", numero, titular, saldo);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        
        int numero = scanner.nextInt();
        scanner.nextLine(); 
        
        String titular = scanner.nextLine();
        
        double saldo = scanner.nextDouble();
        if (saldo < 1) {
            System.out.println("Erro: O saldo nao pode ser negativo.");
            scanner.close();
            return;
        }



        double deposito = scanner.nextDouble();

        // Verificação se o depósito é inválido e encerra o programa
        if (deposito <= 0) {
            System.out.println("Erro: O valor do depósito deve ser positivo.");
            scanner.close();
            return;
        }

        ContaBancaria conta = new ContaBancaria(numero, titular, saldo);
        
        
        conta.depositar(deposito);
        
        conta.exibirSaldo();

        scanner.close();
    }
}