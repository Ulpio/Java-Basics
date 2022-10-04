import java.util.Scanner;

public class Questao5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira sua altura:");
        double alturaEmCm = sc.nextDouble();
        double altura = alturaEmCm/100;
        double pesoIdeal = (72.8*altura)-58;
        System.out.println("Seu peso ideal é: "+pesoIdeal);
    }
}
