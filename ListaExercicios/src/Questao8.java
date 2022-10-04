import java.util.Scanner;

public class Questao8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int resposta;
        int contador=0;
        System.out.println("Você está sendo interrogado, e todas as perguntas deverão respondidas somente com \n Sim{1} e não{2}");
        System.out.println( "Telefonou para a vítima?");
        resposta = sc.nextInt();
        if(resposta==1)
        contador++;
        else{
        }
        System.out.println("Esteve no local do crime?");
        resposta = sc.nextInt();
        if(resposta == 1)
        contador++;
        else{
        }
        System.out.println("Mora perto da vítima?");
        resposta = sc.nextInt();
        if(resposta==1)
        contador++;
        else{
        }
        System.out.println("Devia para a vítima?");
        resposta = sc.nextInt();
        if(resposta==1)
        contador++;
        else{
        }
        System.out.println("Já trabalhou com a vítima?");
        resposta = sc.nextInt();
        if(resposta==1)
        contador++;
        else{
        }
        switch(contador){
            case 2:System.out.println("Suspeito");break;
            case 3:System.out.println("Cúmplice");break;
            case 4:System.out.println("Cúmplice");break;
            case 5:System.out.println("Assassino");break;
            default: System.out.println("Inocente");break;
        }
    }
}
