package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dez números inteiros: ");
		int num;
		int somaNum = 0;
		for (int i = 0; i < 10; i++) {
			num = sc.nextInt();
			somaNum += num;
		}
		System.out.println("A soma de todos os números é: ");
		System.out.println(somaNum);
		sc.close();
	}
}
