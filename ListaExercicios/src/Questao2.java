import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Insira seu salário para o reajuste:");
        double salario = sc.nextInt();
        double reajuste = 0.01;
        double reajusteBruto = salario*reajuste;
        double novoSalario = reajusteBruto+salario;
        System.out.println("Seu salário depois do reajuste é:"+novoSalario);
    }
}
