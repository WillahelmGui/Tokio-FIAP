package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio04 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1, num2, verificarDivisao, verificarMultiplicacao;

		System.out.print("Digite um numero: ");
		num1 = scanner.nextInt();
		System.out.print("Digite outro numero, agora para verificar se este é multiplo: ");
		num2 = scanner.nextInt();

		verificarMultiplicacao = num1 * num2;
		verificarDivisao = verificarMultiplicacao % num2;
		
	
		if(verificarDivisao == 0) {
			System.out.printf("o número %s é mutiplo de %s.", num1, num2 );
		} else {
			System.out.println("Não são multiplos :( ");
		}
		scanner.close();
	}

}
