package src;

public class MinhaClasse{

    public static void main (String[] args){
        String primeiroNome ="Ulpio";
        String segundoNome = "Netto";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);
}


public static String nomeCompleto (String primeiroNome, String segundoNome){
    return "Resultado do Método:" + primeiroNome.concat(" ").concat(segundoNome);

}
}