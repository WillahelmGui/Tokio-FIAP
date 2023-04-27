package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio09 {
//	▪ Escreva um algoritmo que recebe um inteiro positivo n e imprime todos os divisores
//	positivos de n.
//	▪ Utilize o laço for.
//
//	▪ Exemplo:
//	Suponha que n = 28, nessa situação devemos imprimir os números
//	1, 2, 4, 7, 14 e 28, que são todos os divisores do 28.
//
//	▪ Dica: para o número ser divisor de n, a divisão precisa ter resto nulo.
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i = num; i > 0; i--) {
		if(num % i == 0) {
			System.out.println(i);
		}
		}
	}
}
