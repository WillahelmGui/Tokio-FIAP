package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numeroDigitado = sc.nextLine();
		for (int i = 0; i < 3; i++) {
			char posAtual = numeroDigitado.charAt(i);
			char zero = 0;
			char zeroSoma = 0;
			System.out.println(posAtual);
			zero += zeroSoma;
			System.out.println(zero);
		}
	}
}
