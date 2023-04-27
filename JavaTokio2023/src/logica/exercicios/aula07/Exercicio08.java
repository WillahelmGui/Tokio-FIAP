package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i = num; i > 0; i--) {
		num += (i - 1);
		}
		System.out.println("A soma de todos os números é: " + num);
	}
}
