package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String numeroDigitado = sc.nextLine();
		for (int i = 2; i > -1; i--) {
			
			char posAtual = numeroDigitado.charAt(i);
			char zero = 48;
			
			if (i == 2) {
				System.out.printf("\n %s", posAtual);
				continue;
			}
			
			
			if (i == 0) {
				System.out.printf("\n %s%s%s", posAtual, zero, zero);
				continue;
			}
			System.out.printf("\n %s%s", posAtual, zero);
		}
		sc.close();
	}
}
