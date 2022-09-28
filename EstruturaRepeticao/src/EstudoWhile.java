import java.util.concurrent.ThreadLocalRandom;;
public class EstudoWhile {
    public static void main(String[] args) {
        Double mesada = 50.0;
        while(mesada>0){
            Double valorDoce = valorAleatorio();
            if(valorDoce>mesada)
                valorDoce =mesada;
                System.out.println("Doce do valor: "+ valorDoce +"\nAdicionado ao carrinho.");
                mesada = mesada-valorDoce;
        }
        
    }
    private static double valorAleatorio(){
        return ThreadLocalRandom.current().nextDouble(2,20); 
    }
}