package logica.exercicios.aula06;

import java.text.DecimalFormat;

public class Exercicio03 {
	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#,###.##");
		double notas[];
		notas = new double[4];
		double somaNota= 0.0;
		//atribuindo notas aleatorias para o vetor notas
		for(int i=0 ; i <= 3; i++) {
			notas[i] = ((double) Math.random() * 10);
			System.out.println((df.format(notas[i])));
			somaNota += notas[i];	
		}
		somaNota = somaNota / 4;
		System.out.println("A média das notas é: " + df.format(somaNota));
	}
}
