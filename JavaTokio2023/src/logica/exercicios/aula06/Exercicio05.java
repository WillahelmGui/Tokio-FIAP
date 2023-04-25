package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio05 {
	private static final int SOMA = 1;
	private static final int SUBTRACAO = 2;
	private static final int MULTIPLICACAO = 3;
	private static final int DIVISAO = 4;

	public static void main(String[] args) {
		int num1, num2, resultado;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o valor do primeiro numero:");
		num1 = sc.nextInt();
		System.out.println("Digite o valor do segundo numero:");
		num2 = sc.nextInt();
		int kp = sc.nextInt();

			switch (kp) {
			case SOMA:
				resultado = num1 + num2;
				System.out.println(resultado);
				break;

			case SUBTRACAO:
				resultado = num1 - num2;
				System.out.println(resultado);
				break;

			case MULTIPLICACAO:
				resultado = num1 * num2;
				System.out.println(resultado);
				break;

			case DIVISAO:
				resultado = num1 / num2;
				System.out.println(resultado);
				break;

			default:
				System.out.println("Númeor inválido.");
				break;
			}
			sc.close();
	}
}
