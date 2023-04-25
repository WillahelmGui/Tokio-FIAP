package logica.exercicios.aula07;

import java.util.Scanner;

public class Exercicio07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int quantidadeAlunosAprovados = 0;
		int quantidadeAlunosReprovados = 0;
		double nota;
		double media = 7.0;
		for(int i = 0; i < 3 ; i++) {
			nota = sc.nextDouble();
			if(nota >= media) {
				quantidadeAlunosAprovados++;
				System.out.println("A quantidade de alunos aprovados é:" + quantidadeAlunosAprovados);
			} else {
				quantidadeAlunosReprovados++;
				System.out.println("A quantidade de alunos reprovados é:" + quantidadeAlunosReprovados);
			}
		}
		sc.close();
	}
}
