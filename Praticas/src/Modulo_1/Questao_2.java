package Modulo_1;

import java.util.Scanner;

public class Questao_2 {

	public static void main(String[] args) {
		System.out.println("Bem vindo ao Bonificador");

		String nome;
		String porcetagem = "0%";// Deixei instanciado caso o valor tenha dado invalido.
		double bonus = 0;
		double salario = 0;
		double salarioComBonus = 0;
		double somaSalario = 0;
		double somaSalarioComBonus = 0;

		Scanner entradaDeDados = new Scanner(System.in);

		do {

			System.out.println("Digite um nome: ,Ou caso queria encerrar o programa Digite: fim");
			nome = entradaDeDados.nextLine();
			if (!nome.equalsIgnoreCase("fim")) {
				System.out.println("Digite seu salario: ");
				salario = entradaDeDados.nextDouble();
				entradaDeDados.nextLine();// Corrigindo o valor que double libera e garatindo que nextline sera lida em
											// sequencia

				if (salario > 600) {
					salarioComBonus = salario * 1.10;
					porcetagem = "10%";
				} else if (salario > 300 && salario <= 600) {
					salarioComBonus = salario * 1.15;
					porcetagem = "15%";
				} else if (salario > 150 && salario <= 300) {
					salarioComBonus = salario * 1.20;
					porcetagem = "20%";
				} else if (salario > 0 && salario <= 150) {
					salarioComBonus = salario * 1.25;
					porcetagem = "25%";
				} else {
					System.out.println("Valor invalido");

				}
				somaSalario += salario;
				somaSalarioComBonus += salarioComBonus;
				System.out.println("Parabens senhor(a): " + nome.toUpperCase());
				System.out.println("o seu salario de: " + salario);
				System.out.println("recebeu um bonus de: " + porcetagem + " e passou a ser: " + salarioComBonus);
			}

		} while (!nome.equalsIgnoreCase("fim"));
		entradaDeDados.close();

		bonus = somaSalarioComBonus - somaSalario;

		System.out.println("A soma dos salarios distribuidos foi de : " + somaSalario);
		System.out.println("Os salarios com adiçâo do bonus foram para : " + somaSalarioComBonus);
		System.out.println("O total de bonus distribuido foi de: " + bonus);
	}
}
