public class PetMachine {
    private final Integer MAX_SHAMPOO = 10;
    private final Integer MAX_WATER = 30;
    private Boolean clean;
    private Integer water;
    private Integer shampoo;
    private Pet pet;

    public PetMachine(){
        super();
        this.clean= true;
        this.water= 30;
        this.shampoo=10;
    }
     
    public void takeAShower(){
        if(this.pet==null){
            System.out.println("Não há pet a ser limpo!");
            return;
        }
        this.water-=10;
        this.shampoo-=2;
        pet.setClean(true);
        System.out.println("O pet "+ pet.getName() + " está limpo!");
    }


    public void addWater(){
        if(water>=MAX_WATER){
            System.out.println("A capacidade de agua da maquina esta no maximo");
            return;
        }
        water+=2;
    }

    public void addShampoo(){
        if(shampoo>=MAX_SHAMPOO){
            System.out.println("A capacidade maxima de shampoo esta no maximo!");
            return;
        }
        shampoo+=2;
    }

    public int getWater(){
        return water;
    }

    public int getShampoo(){
        return shampoo;
    }

    public boolean hasPet(){
        return pet!=null;
    }

    public void getLevelWater(){
        System.out.println("O nivel de agua eh: "+ getWater());;
    }
    
    public void getLevelShampoo(){
        System.out.println("O nivel de shampoo eh: "+ getShampoo());;
    }

    public void setPet(Pet pet){
        if(!this.clean){
            System.out.println("A maquina esta suja, para colcoar o pet, deve ser limpa!");
            return;
        }
        if(hasPet()){
            System.out.println("O pet "+ this.pet.getName()+ " está na maquina nesse momento!");
            return;
        }
        this.pet= pet;
    }

    public void removePet(){
        if(this.pet.isClean()){
            System.out.println("O pet "+ pet.getName()+" está limpo");
        }else {
            System.out.println("O pet "+ pet.getName()+" não está limpo");
            return;
        }
        this.pet=null;

    }
    public void wash(){
        if(this.water<10 && this.shampoo<2){
            System.out.println("Não há material suficiente na maquina!");
            return;
        }
        this.water-=10;
        this.shampoo-=2;
        this.clean=true;
        System.out.println("A maquina foi limpa");
    }
}
