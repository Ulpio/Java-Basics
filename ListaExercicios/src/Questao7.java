import java.rmi.server.SocketSecurityException;
import java.util.Scanner;

public class Questao7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int area;
        int cobertura;
        int lata = 18;
        int preco = 80;
        int precoTotal;
        int custoBeneficio;
        System.out.println("Insira a àrea que será pintada:");
        area = sc.nextInt();
        cobertura = 3*area;
        custoBeneficio = cobertura/lata;
        precoTotal = custoBeneficio*preco;
        System.out.println("Serão necessárias "+custoBeneficio+" latas. O valor total foi de: R$"+precoTotal);
        

    }
}
