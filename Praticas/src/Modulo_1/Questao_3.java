package Modulo_1;

import java.util.Scanner;

public class Questao_3 {
	public static void main(String[] args) {
		
		System.out.println("O Conversor em binario");
		
		int numero;
		
		Scanner entradaDeDados = new Scanner(System.in);
		
		System.out.println("Digite um numero inteiro: ");
		numero= entradaDeDados.nextInt();
		entradaDeDados.close();
		for(int i=numero;i>0;i/=2){
			if (i!=numero) {
				System.err.print(i);
			}
		}
		System.out.println(" numero convertido em binario!");
	}

}
