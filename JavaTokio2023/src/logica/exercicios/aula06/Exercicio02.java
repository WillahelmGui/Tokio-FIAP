package logica.exercicios.aula06;

import java.util.Scanner;

public class Exercicio02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		
		//logica
		if(num1>num2) {
			System.out.println(num1);
		} else if (num2 > num1) {
			System.out.println(num2);
		} else if (num2 == num1) {
			System.out.println("Os números são iguais");
		} else {
			System.out.println("Algo deu errado.");
		}
		sc.close();
	}
}
