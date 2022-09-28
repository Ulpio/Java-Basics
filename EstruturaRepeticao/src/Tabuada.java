import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) throws Exception {
        System.out.println("insira o numero que quer calcular a tabuada");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();
        int contador;
        int resultado;
        System.out.println("Tabuada de "+numero+":");

        for (contador = 0; contador <=10;contador++){
            resultado = contador * numero;
            System.out.println(numero+"x"+contador+"="+resultado);
        }

    }
}
