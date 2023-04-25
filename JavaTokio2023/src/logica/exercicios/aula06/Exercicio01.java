package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero = sc.nextInt();
		//logica de identificação par ou impar
		int parOuImpar = numero % 2;
		if(parOuImpar == 0) {
			System.out.println("Par");
		} else {
			System.out.println("Impar");
		}
		sc.close();
	}
}
