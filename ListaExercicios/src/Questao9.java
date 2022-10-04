import java.util.Scanner;

public class Questao9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int combustivel;
        int litros;
        Double preco;
        Double descontoReal;
        Double precoFinal;
        System.out.println("Olá, qual combustível vai querer?\n Digite 1 para Álcool e 2 para Gasolina.");
        combustivel = sc.nextInt();
        switch(combustivel){
        
            case 1:{System.out.println("Quantos litros vai querer?");
            litros = sc.nextInt();
            preco = litros * 1.9;
            if(litros <=20){
                descontoReal = preco *0.03;
                precoFinal =preco - descontoReal;
                System.out.println("Você escolheu Álcool,pediu "+litros+" e resultou em: R$"+precoFinal);
                
            }
            else{
                descontoReal = preco * 0.05;
                precoFinal = preco - descontoReal;
                System.out.println("Você escolheu Álcool,pediu "+litros+" e resultou em: R$"+precoFinal);
                
            }
        break;}
            case 2:{System.out.println("Quantos litros vai querer?");
            litros = sc.nextInt();
            preco = litros * 2.50;
            if (litros<=20){
                descontoReal = preco *0.04;
                precoFinal = preco - descontoReal;
                System.out.println("Você escolheu Gasolina,pediu "+litros+" e resultou em: R$"+precoFinal);
            }
            else{
                descontoReal = preco * 0.06;
                precoFinal = preco - descontoReal;
                System.out.println("Você escolheu Gasolina,pediu "+litros+" e resultou em: R$"+precoFinal);
            }
        break;}
            default:{System.out.println("Valor inválido.");}
        

    }
}
}
