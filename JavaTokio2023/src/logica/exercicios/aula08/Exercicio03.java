package logica.exercicios.aula08;

import java.util.Scanner;

//▪ Faça um programa que recebe um texto qualquer do usuário.
//▪ A seguir, exiba:
//▪ A quantidade de caracteres alfabéticos maiúsculos
//▪ A quantidade de caracteres alfabéticos minúsculos
//▪ A quantidade de caracteres numéricos
//▪ A quantidade de espaço em branco

public class Exercicio03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String textoDigitado = sc.nextLine();

		int qtdLetrasM = 0, qtdLetrasMin = 0, qtdNumeros = 0, qtdEspacos = 0;
		for (int i = 0; i < textoDigitado.length(); i++) {
			// verificando se é um caractere alfabético maiúsculo.
			if ((textoDigitado.charAt(i) >= 'A') && (textoDigitado.charAt(i) <= 'Z')) {
				qtdLetrasM += 1;
				// verificando se é um caractere numérico.
			} else if ((textoDigitado.charAt(i) >= '0') && (textoDigitado.charAt(i) <= '9')) {
				qtdNumeros += 1;
				// verificando sé é um caractere vazio.
			} else if (textoDigitado.charAt(i) == ' ') {
				qtdEspacos += 1;
			} else {
				qtdLetrasMin += 1;
			}
		}
		sc.close();
		System.out.println("Quantidade de Letras Maiúsculas" + qtdLetrasM);
		System.out.println("Quantidade de Letras Minúsculas" + qtdLetrasMin);
		System.out.println("Quantidade de espaços" + qtdEspacos);
		System.out.println("Quantidade de números" + qtdNumeros);
	}
}
