package Modulo_1;

import java.util.Scanner;

public class Questao_1 {
    
    public static void main(String[] args) {
        
        Scanner entradaDeDados = new Scanner(System.in);
        
        System.out.println("Bem Vindo ao verificador Par e Ímpar.");

        System.out.println("Digite o Primeiro valor inteiro: ");
        int valor1 = entradaDeDados.nextInt();
        
        System.out.println("Digite o Segundo valor inteiro: ");
        int valor2 = entradaDeDados.nextInt();

        entradaDeDados.close();
        if (valor1%2==0 && valor2%2==0) {

            System.out.println("Ambos são pares.");
            
        } else if (valor1%2==0 && valor2%2!=0) {
            System.out.println("O primeiro valor e Par , O segundo e impar.");
        } else if (valor1%2!=0 && valor2%2==0) {
            System.out.println("O primeiro valor e Impar , O segundo e Par." );
            
        }else{
            System.out.println("Ambos são impares.");
        }
        System.out.println("Obrigado por usar.");
    } 
}