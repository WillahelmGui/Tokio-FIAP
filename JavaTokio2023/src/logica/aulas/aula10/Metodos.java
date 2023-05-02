package logica.aulas.aula10;

import java.util.Scanner;

public class Metodos {
	public static void main(String[] args) {
	saudacao();
	}
	static void saudacao() {
	System.out.println("Digite seu nome.");
	Scanner sc = new Scanner(System.in);
	String nome = sc.nextLine();
	System.out.println("Digite sua idade.");
	int idade = sc.nextInt();
	System.out.printf("Bem vindo %s, você tem %s anos. \n", nome, idade);
	sc.close();
	}
	}
