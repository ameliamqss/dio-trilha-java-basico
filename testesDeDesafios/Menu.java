import java.util.Scanner;

public class Menu {

    private final static Scanner sc= new Scanner(System.in);
    private final static PetMachine petMachine= new PetMachine();
    public static void main (String[] args){
        Scanner sc= new Scanner(System.in);
        int op;
        do{
            System.out.println("===Escolha uma das opções===");
            System.out.println("1 - Dar banho no pet");
            System.out.println("2 - Abastecer a maquina de agua");
            System.out.println("3 - Abastecer a maquina de shampoo");
            System.out.println("4 - Verificar agua na maquina");
            System.out.println("5 - Verificar shampoo na maquina");
            System.out.println("6 - Verificar se há pet na maquina");
            System.out.println("7 - Colocar pet na maquina");
            System.out.println("8 - Retirar pet da maquina");
            System.out.println("9 - Limpar a maquina");
            System.out.println("0 - Sair do programa");
            op= sc.nextInt();

            switch (op) {
                case 1-> petMachine.takeAShower();
                case 2-> setWater();
                case 3-> setShampoo();
                case 4-> petMachine.getLevelWater();
                case 5-> petMachine.getLevelShampoo();
                case 6-> checkIfhasPetInMachine();
                case 7 -> setPetInMachine();
                case 8 -> petMachine.removePet();
                case 9-> petMachine.wash();
                case 0-> System.exit(0);
                default -> System.out.println("Opção inválida");
            }

        }while(true);
    }



    private static void setShampoo(){
        System.out.println("tentando colocar shampoo na maquina");
        petMachine.addShampoo();
    }
    private static void setWater(){
        System.out.println("Tentando adicionar agua na maquina!");
        petMachine.addWater();
    }

    private static void checkIfhasPetInMachine(){
        var hasPet= petMachine.hasPet();
        System.out.println(hasPet? "Tem pet na maquina!":"Não tem pet na maquina!");
    }
    private static void setPetInMachine(){
        var name= "";
        while (name== null || name.isEmpty()) {
            System.out.println("Informe o nome do pet: ");
            name = sc.nextLine();
        }   
        var pet= new Pet(name);
        petMachine.setPet(pet);
        System.out.println("O pet "+ pet.getName()+ " foi colocado na maquina!");   
    }
}
