import java.util.Scanner;
public class Teste {
    public int numeroesc;
    public int chute;
    Scanner scanner = new Scanner(System.in);


    public int colherDados(){
        System.out.println("Digite um número a ser adivinhado:");
        numeroesc= scanner.nextInt();
        if(numeroesc<=0){
            System.out.println("Digite um número maior que zero.");
        }
        return numeroesc;
    }

    public int chute(){
        System.out.println("Digite um número para adivinhar:");
        chute = scanner.nextInt();
        if(chute<=0){
            System.out.println("Digite um número maior que zero.");
        } 
        return chute;
    }

    public void resultado(){
        if(número)
    }

}
