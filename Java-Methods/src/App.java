public class App {
    
    public double somar(int num1,int num2){
        return num1+num2;
    }
    public void imprimir(String text){
        //Logica - finalidade do Método
        //aqui não precisa de return
        //pois não sera retornado nenhum resultado
    }
    public double dividir (int dividendo,int divisor)throws Exception{
        return dividendo/divisor;
    }
    private void metodoPrivado(){
    }
    /*public void validar(){
        //este metodo deveria retornar algum valor
        //no caso boolean (true ou false)
    }*/
    public void calcularEnviar(){
        //este método deve ter só uma responsabilidade.
    }
}