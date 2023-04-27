package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int kp;
		int num = 0;
		do {
			System.out.println("Digite um número inteiro: ");
		num = sc.nextInt();
		if(num % 2 == 0) {
			System.out.println("O número"+ num + "é par.");
		} else {
			System.out.println("O número"+ num + "é impar.");
		}
		System.out.println("Você gostaria de continuar? \n 1. SIM \n 2. NÃO");
		kp = sc.nextInt();
		}while (kp != 0);
		sc.close();
	}
}
