package Modulo_1;


import java.util.Scanner;

public class Questao_4 {
	public static void main(String[] args) {
		int f=0;
		int f2=0;
		int numero;
		int i=1;
		
		System.out.println("Testador Fibonacci");
		
		Scanner entradaDeDados = new  Scanner (System.in);
		System.out.println("Digite um numero e  descubrar se ele faz parte da sequencia Fibonacci");
		numero = entradaDeDados.nextInt();
		entradaDeDados.close();
		
		while(i<=numero) {
		
			f=i-f2;
			f2=i;
			i+=f2;
			System.out.println(f);
		
		}

}}
