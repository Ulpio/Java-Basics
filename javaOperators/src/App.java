

public class App {
    public static void main(String[] args) throws Exception {
        String nome = "Úlpio";
        double peso = 75.4; //Brazil = 75,4
        char sexo = 'M';
        boolean doadorSangue = false;
        
        //Aritméticos
        double soma = 10.5 + 15.7;
        int subtração = 113 - 25;
        int mult = 20 * 7;
        int divisao = 15/3;
        int modulo = 18 %3;
        double resultado = (10*7) + (20/4);

        //operador + contatenará textos
     
        System.out.println(nome+peso+sexo+doadorSangue+soma+subtração+mult+divisao+modulo+resultado);
    }
}