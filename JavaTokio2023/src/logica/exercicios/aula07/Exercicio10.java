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
	static int limite= 2000;
	ArrayList<int[]> numerosPrimos = new ArrayList<int[]>();

	public static void main(String[] args) {
		if(Primo(3) == true) {
			System.out.println("Numero primo?" + Primo(3));
		}

	}
	
	public static boolean Primo(int num) {
		for (int j = 2; j < num; j++) {
			if (num % j == 0)
				return false;
		}
		return true;
	}
}
//TODO terminar a classe Exercicio10!