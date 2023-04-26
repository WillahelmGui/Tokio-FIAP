package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio09 {
	private static final int INDUSTRIA = 1;
	private static final int COMERCIO = 2;
	private static final int RESIDENCIA = 3;
	public static void main(String[] args) {
		double valordoKwH, quantidadeKwH = Math.random() * 150, valorPagamento;
		Scanner sc = new Scanner(System.in);
		int opcaoEscolhida = sc .nextInt();

		switch (opcaoEscolhida) {
		case INDUSTRIA: {
			valordoKwH = 1.20;
			valorPagamento = valordoKwH * quantidadeKwH;
			System.out.println(valorPagamento);
			break;
		}
		case COMERCIO: {
			valordoKwH = 0.48;
			valorPagamento = valordoKwH * quantidadeKwH;
			System.out.println(valorPagamento);
			break;
		}

		case RESIDENCIA: {
			valordoKwH = 0.60;
			valorPagamento = valordoKwH * quantidadeKwH;
			System.out.println(valorPagamento);
			break;
		}

		default:
			throw new IllegalArgumentException("Unexpected value: " + opcaoEscolhida);
		}
	}
}
