public class Televisao {
    boolean ligada = false;
    int canal = 1;
    int volume =5;
    public void ligar(){
        ligada=true;
        System.out.println("A Televisão agora está ligada.");
    }
    public void desligar(){
        ligada=false;
        System.out.println("A Televisão agora está desligada.");
    
    }
    public void subirCanal(){
        canal++;
        System.out.println("Agora o canal é:"+canal);
    }
    public void descerCanal(){
        canal--;
        System.out.println("Agora o canal é:"+canal);
    }
    public void aumentarVolume(){
        volume++;
        System.out.println("Agora o volume é:"+volume);
    }
    public void diminuirVolume(){
        volume--;
        System.out.println("Agora o volume é:"+volume);
    }
    public void mudarCanal(int novoCanal){
        canal = novoCanal;

    }
}
