package logica.exercicios.aula08;

//Exercício 6
//
//▪ Faça um programa que sorteio 100 números inteiros entre 0 e 100 (incluindo 100).
//▪ Ao final, exiba as seguintes informações:
//▪ Foram sorteados XX números pares.
//▪ Foram sorteados XX números ímpares.
//▪ Foram sorteados XX números primos.

public class Exercicio06 {
	public static void main(String[] args) {
		// Sorteia 100 números.
		int min = 0, max = 101, numerosPrimos = 0, pares = 0, impares = 0;
		for (int i = 0; i < 10; i++) {
			int sorteio = (int) (min + Math.random() * (max - min));

			if (Primo(sorteio) == true) {
				numerosPrimos += 1;
			}
			if (sorteio % 2 == 0) {
				pares += 1;
			} else {
				impares += 1;
			}
			System.out.println(sorteio);
		}
		System.out.printf(" \n Foram sorteados %s numeros pares", pares);
		System.out.printf(" \n Foram sorteados %s numeros impares", impares);
		System.out.printf(" \n Foram sorteados %s numeros primos", numerosPrimos);
	}

	// Verifica se o número é primo.
	private static boolean Primo(int numero) {
		for (int j = 2; j < numero; j++) {
			if (numero % j == 0)
				return false;
		}
		return true;
	}
}
