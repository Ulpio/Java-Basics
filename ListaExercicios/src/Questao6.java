import java.util.Scanner;

public class Questao6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pesoBase,pesoPescado,excesso;
        double multaFixa = 4.00;
        double multaAtual = 0;
        double multafinal = 0;
        pesoBase = 50;
        System.out.println("Insira o peso do Peixe Pescado");
        pesoPescado = sc.nextInt();
        excesso = pesoPescado - pesoBase;
        if (excesso >=1){
            System.out.println("Paga multa!");
            for(int i = 0;i<=excesso;i++){
                multafinal = multaAtual + (multaFixa*i);
            }
            System.out.println("Multa com o valor de: R$"+multafinal);
        }
        else{
            System.out.println("não paga multa");
        }    
    }
    
}
