package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double salario;
		System.out.println("Qual o valor do seu salário em reais?");
		salario = sc.nextDouble();
		if (salario <= 280) {
			System.out.println("Salario antigo: " + salario);
			salario = salario + ((salario / 100) * 20);
			System.out.println("Salario novo: " + salario);
		} else if (salario > 280 && salario < 700) {
			System.out.println("Salario antigo: " + salario);
			salario += (salario/100 * 15);
			System.out.println("Salario novo: " + salario);
		} else if (salario >= 700 && salario < 1500) {
			System.out.println("Salario antigo: " + salario);
			salario += (salario/100 * 10);
			System.out.println("Salario novo: " + salario);
		} else {
			System.out.println("Salario antigo: " + salario);
			salario += (salario/100 * 5);
			System.out.println("Salario novo: " + salario);
		}
	}
}
