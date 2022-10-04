import java.util.*;

public class Questao3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("insira seu salário:");
        //vou arrendondar salario minimo para R$1200, mas o valor absoluto é R$1212;
        int salariominimo = 1200;
        double salarioInformado = sc.nextDouble();
        double quantidadeSalarios = salarioInformado/salariominimo;
        System.out.println("Você recebe "+quantidadeSalarios+" Salarios minimos");
        
    }
}
