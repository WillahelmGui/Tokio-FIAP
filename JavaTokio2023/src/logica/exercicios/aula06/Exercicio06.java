package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade = sc.nextInt();

		if (idade < 16) {
			System.out.println("O voto é proibido para você, nesse ano.");
		} else if ((idade >= 16 && idade < 18) || idade > 70) {
			System.out.println("Voto é opicional para você, esse ano.");

		} else {
			System.out.println("Voto é obrigatório para você, esse ano.");
		}
		sc.close();
	}
}
