public class Usuario {
    public static void main(String[] args) {
        Televisao smartTv = new Televisao();

        System.out.println("A tv está ligada?\n"+smartTv.ligada);
        System.out.println("Qual canal?\n"+smartTv.canal);
        System.out.println("Qual volume?\n"+smartTv.volume);

        smartTv.aumentarVolume();
        smartTv.subirCanal();
        smartTv.subirCanal();
        smartTv.mudarCanal(13);

        System.out.println("A tv está ligada?\n"+smartTv.ligada);
        System.out.println("Qual canal?\n"+smartTv.canal);
        System.out.println("Qual volume?\n"+smartTv.volume);
    }
}
