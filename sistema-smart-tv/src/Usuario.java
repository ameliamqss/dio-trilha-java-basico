public class Usuario {
    public static void main(String[] args) throws Exception {
        SmarTv smartTv = new SmarTv();
        System.out.println("Tv ligada? "+ smartTv.ligada);
        System.out.println("Canal atual? " + smartTv.canal);
        System.out.println("Volume atual? "+ smartTv.volume);


        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume atual: "+smartTv.volume);

        System.out.println("Canal atual? " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual? " + smartTv.canal);



        smartTv.ligar();
        System.out.println("Novo status -> Tv ligada? "+ smartTv.ligada);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada? "+ smartTv.ligada);


    }
}
