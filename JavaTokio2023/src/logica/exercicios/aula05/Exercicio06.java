package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio06 {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("nome da peça 01");
		String nomePeca01 = sc.nextLine();
		System.out.println("quantidade peca 01");
		float quantidadeDesejada = sc.nextFloat();
		System.out.println("valor peca 01");
		float valorPeca01 = sc.nextFloat();
		System.out.println("nome peca 02");
		String nomePeca02 = sc.nextLine() + sc.nextLine();
		System.out.println("quantidade peca 02");
		int quantidadePeca02 = sc.nextInt();
		System.out.println("valor peca 02");
		float valorPeca02 = sc.nextFloat();
		System.out.println(
				"o valor da sua compra é:" + ((valorPeca01 * quantidadeDesejada) + (valorPeca02 * quantidadePeca02)));
		sc.close();
	}
}
