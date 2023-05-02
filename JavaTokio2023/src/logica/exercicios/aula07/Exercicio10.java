package logica.exercicios.aula07;

import java.util.ArrayList; // import the ArrayList class
//▪ Determine e mostre todos os números primos no intervalo de 2 a 2000.
//
//Dicas:
//▪ Para resolver esse problema, primeiro faça um algoritmo que verifica se um número
//inteiro qualquer é primo ou não.
//▪ A seguir, com esse código em mãos, faça os ajustes necessários para mostrar todos os
//números primos no intervalo solicitado.
//▪ Você precisará colocar uma estrutura de repetição

public class Exercicio10 {
	static int limite = 2000;
	static ArrayList<Integer> numerosPrimos = new ArrayList<>();

	public static void main(String[] args) {
		numerosPrimos.add(2);
		
		for (int i = 3; i < limite; i++) {
			if (verificarNumPrimo(i) == true) {
				System.out.printf("O número %s é primo. \n", i);
				numerosPrimos.add(i);
			} else {
				System.out.printf("O numero %s nao e primo. \n", i);
			}
		}
		System.out.println(numerosPrimos);
	}

	static boolean verificarNumPrimo(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0) {
				return false;
			} else {
				return true;
			}

		}
		return true;
	}
}
//TODO terminar a classe Exercicio10!