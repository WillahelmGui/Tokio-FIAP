package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio08 {
	public static void main(String[] args) {
		final int DOLAR = 1;
		final int EURO = 2;
		final int PESO_ARGENTINO = 3;
		final int LIBRA_ESTERLINA = 4;
		final int IENE = 5;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor para câmbio.");
		float valorEmReais = sc.nextFloat();
		System.out.println("Escolha sua opção. \n" + "1. Dolar \n" + "2. Euro \n" + "3. Peso Argentino \n"
				+ "4. Libra Esterlina \n" + "5. Iene \n");
		int kp = sc.nextInt();
		switch (kp) {
		case DOLAR:
			float valorDolar = 5.07f;
			float resultado = (valorEmReais * valorDolar);
			System.out.printf("A quantia correspondente é : %.2f \n", resultado);
			break;
		case EURO:
			float valorEuro = 5.55f;
			resultado = (valorEmReais * valorEuro);
			System.out.printf("A quantia correspondente é : %.2f \n", resultado);
			break;
		case PESO_ARGENTINO:
			float valorPesoArgentino = 42.86f;
			resultado = (valorEmReais * valorPesoArgentino);
			System.out.printf("A quantia correspondente é : %.2f \n", resultado);
			break;
		case LIBRA_ESTERLINA:
			float valorLibraEsterlina = 0.16f;
			resultado = (valorEmReais * valorLibraEsterlina);
			System.out.printf("A quantia correspondente é : %.2f \n", resultado);
			break;
		case IENE:
			float valorIene = 0.0376f;
			resultado = (valorEmReais * valorIene);
			System.out.printf("A quantia correspondente é : %.2f \n", resultado);
			break;
		}
		sc.close();
	}
}
