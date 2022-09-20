package src;

import java.util.Scanner;

public class Calculadora{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Questão 1:Faça um programa que leia seu nome e imprima a mensagem “Olá ” seguida do seu nome.");
        System.out.println("Insira seu Nome:");
        String nome = entrada.nextLine();
        //.nextLine aceita só string
        System.out.println("Olá " + nome);
        System.out.println("2. Faça um programa que leia dois números inteiros e exiba a soma, produto, diferença, média, razão e o resto entre eles.");
        System.out.println("Insira um número:");
        int num1 = entrada.nextInt();
        System.out.println("Insira outro Número:");
        int num2 = entrada.nextInt();
        int soma = num1 + num2;
        System.out.println("A soma é:" + soma);
        int sub = num1 - num2;
        System.out.println("A subtração é:" + sub);
        int media = (num1 + num2)/2;
        System.out.println("A média é:" + media);
        int mult = num1 * num2;
        System.out.println("A multiplicação é:"+ mult);
        int div = num1 / num2;
        System.out.println("A divisão é:" + div);
        int resto = num1 % num2;
        System.out.println("O resto é:" + resto);
        System.out.println("3. Faça um programa que leia um número e imprima se o número é par ou ímpar.");
        int numero = entrada.nextInt();
        if(numero % 2 == 0){
            System.out.println("O numero é par!");
        }
        else{
            System.out.println("O numero é impar!");
        }
        System.out.println("4. Faça um programa que leia três números, calcule a média entre eles e exiba a mensagem se a média é maior, menor ou igual a 7.");
        System.out.println("Insira um numero:");
        int numero1 = entrada.nextInt();
        System.out.println("Insira outro numero:");
        int numero2 = entrada.nextInt();
        System.out.println("Insira outro numero:");
        int numero3 = entrada.nextInt();
        int mediaa = (numero1 + numero2 + numero3)/3;
        if (mediaa == 7){
            System.out.println("média igual a 7");
        }
        else if (mediaa > 7 ){
            System.out.println("media maior que 7");
        }
        else
            System.out.println("Média menor que 7");
        }
    }
