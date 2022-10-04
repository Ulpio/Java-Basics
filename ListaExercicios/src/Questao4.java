import java.util.Scanner;

public class Questao4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor:");
        int numero = sc.nextInt();
        int numeroAntecessor = numero -1;
        int numeroSucessor = numero +1;
        System.out.println("O valor digitado foi: "+numero);
        System.out.println("O antecessor é: "+numeroAntecessor);
        System.out.println("O sucessor é: "+numeroSucessor);
    }   
}
