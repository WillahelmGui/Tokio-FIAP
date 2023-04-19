package logica.exercicios.aula05;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int kp = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Qual seu nome?");
		sc.nextLine();
		System.out.println("Escolha seu gênero: \n 0.Masculino \n 1.Feminino \n 2. Outro  \n 3.Não responder. \n");
		kp = sc.nextInt();
		switch (kp) {
		case 0:
			System.out.println("Olá, %s! Você escolheu as eguinte opção de gênero : M");
			break;
		case 1:
			System.out.println("Olá, %s! Você escolheu as eguinte opção de gênero : F");
			break;
		case 2:
			System.out.println("Olá, %s! Você escolheu as eguinte opção de gênero : O");
			break;
		case 3:
			System.out.println("Olá, %s! Você escolheu as eguinte opção de gênero : N");
			break;
		}

	}
}
